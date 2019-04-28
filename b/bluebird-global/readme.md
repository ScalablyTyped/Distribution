
# Scala.js typings for bluebird-global

Typings are for version 3.5

## Library description:
Patches global.Promise to use bluebird and returns a bluebird instance

|                    |                 |
| ------------------ | :-------------: |
| Full name          | bluebird-global |
| Keywords           | polyfill, promise-library, promise, performance, promises, promises-a, promises-aplus, async, await |
| # releases         | 4 |
| # dependents       | 9 |
| # downloads        | 49625 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/kaatt/bluebird-global#readme)
- [Bugs](https://github.com/kaatt/bluebird-global/issues)
- [Repository](https://github.com/kaatt/bluebird-global)
- [Npm](https://www.npmjs.com/package/bluebird-global)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for bluebird 3.5
// Project: https://github.com/kaatt/bluebird-global
// Definitions by: d-ph <https://github.com/d-ph>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 2.8
/*
 * 1. Why use `bluebird-global` instead of `bluebird`?
 *
 * If you want to leverage the fact, that bluebird polyfills the global Promise in the browser, then
 * you need to tell TypeScript about this. The following declaration file does exactly that.
 *
 * 1.1. Why you might not want to use `bluebird-global` instead of `bluebird`.
 *
 * Because of how these typings tell TypeScript about bluebird's Promise methods, it is not
 * possible to cast global Promises to Bluebird promises in your code. In other words, you won't
 * be able to do the following (even though it's possible at the runtime):
 *
 *   let bluebirdPromise: Bluebird<string> = new Promise<string>(() => { return 'Lorem ipsum'; });
 *
 * If you need to, you can walk-around this by constructing a new Bluebird promise over an instance
 * of the global Promise, like so:
 *
 *   let bluebirdPromise: Bluebird<string> = Bluebird.resolve(
 *     new Promise<string>(() => { return 'Lorem ipsum'; })
 *   );
 *
 * So the bottom line is: if you use these typings, then be mindful when you try to mix the global
 * Promises with the Bluebird promises. You can avoid this problem by just settling on using either
 * of them and not both of them at the same time.
 *
 * 1.2. Further limitations of `bluebird-global` typings: the return type of Bluebird's methods.
 *
 * Due to the fact of how bluebird-specific methods are exposed on the global Promise, the
 * return type of those methods is Bluebird<T> instead of Promise<T>. This is relevant in the
 * following case:
 *
 *   function createDelayedPromise(): Promise<void> {
 *     return Promise.delay(250);
 *   }
 *
 * Since Promise.delay() returns a Bluebird<void> and the function is typed to return a Promise<void>,
 * an implicit cast is performed from Bluebird<void> to Promise<void>. And since an instance
 * of Bluebird isn't and instance of Promise (due to how `bluebird-global` works), this implicit
 * cast fails to compile. In order to walk-around this problem, the following explicit cast should
 * be used:
 *
 *   function createDelayedPromise(): Promise<void> {
 *     return <Promise<void>> Promise.delay(250);
 *   }
 *
 * 2. How to use it?
 *
 * It should just work, but there are a couple of points to be wary about:
 *
 * a) If you already use `compilerOptions.types` in your `tsconfig.json`, then add `bluebird-global`
 *    to the list:
 *
 *    {
 *      "compilerOptions": {
 *        "types": [
 *          (other types ...)
 *
 *          "bluebird-global"
 *        ],
 *      }
 *    }
 *
 * b) Be aware, that you still need to get the global Promise symbol to be replaced with bluebird.js
 *    in the runtime. Do this by either importing bluebird.js via a `<script />` tag in your html or
 *    via importing it in your js entry file AND assigning it to the global Promise symbol.
 *
 * c) if you're `--target`ing "es5", then you'll need to include the "es2015.iterable" lib typings to
 *    let the bluebird.d.ts compile (requirement for Map, Iterable & friends). This is only for the
 *    compile-time, since bluebird doesn't require these es6 features to be present in the runtime.
 *    To summarise: when targeting "es5", make sure you have the follwing "lib" config in your tsconfig.json:
 *
 *    {
 *      "compilerOptions": {
 *        "lib": [
 *          "es5",
 *          "es2015.iterable",
 *          "dom"
 *          (more, if you need...)
 *        ],
 *      }
 *    }
 *
 * 3. Why so much effort?
 *
 * If a promise-polyfilling library wants to play nicely with TypeScript, it needs to augment
 * the Promise<T> and PromiseConstructor interfaces defined in the standard ts library.
 * For various reasons this couldn't be done in The `bluebird` typings.
 *
 * 4. Contributors: After changing this file please manually test these cases (via altering ./tsconfig.json ):
 *   a. target es5, with the following `lib` keys: "es5", "es2015.iterable", "dom"
 *   b. target es6, no `lib` key
 *   c. target es5, latest "es20xx", e.g. "es2017"
 *   d. target es6, latest "es20xx", e.g. "es2017"
 */

/*
 * @todo When dropping TS 2.x support, uncomment the following triple-slash directives and
 * remove the copy&paste from this file (marked with #std-lib-copy&paste-to-remove)
 *
 * TS 2.x support should be dropped once bluebird's typings stop compiling on 2.x (i.e.
 * once bluebird's typings stop supporting TS 2.x)
 */
/* /// <reference lib="es5" /> */
/* /// <reference lib="es2015.promise" /> */
/* /// <reference lib="es2018.promise" /> */


```

