
# Scala.js typings for define-lazy-prop

Typings are for version 2.0.0

## Library description:
Define a lazily evaluated property on an object

|                    |                 |
| ------------------ | :-------------: |
| Full name          | define-lazy-prop |
| Keywords           | lazy, property, properties, prop, define, object, value, lazily, laziness, evaluation, eval, execute, getter, function, fn, memoize, cache, defer, deferred |
| # releases         | 0 |
| # dependents       | 1 |
| # downloads        | 823 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/sindresorhus/define-lazy-prop#readme)
- [Bugs](https://github.com/sindresorhus/define-lazy-prop/issues)
- [Repository](https://github.com/sindresorhus/define-lazy-prop)
- [Npm](https://www.npmjs.com/package/define-lazy-prop)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Define a [lazily evaluated](https://en.wikipedia.org/wiki/Lazy_evaluation) property on an object.

@param object - Object to add property to.
@param propertyName - Name of the property to add.
@param fn - Called the first time `propertyName` is accessed.

@example
```
import defineLazyProp = require('define-lazy-prop');

const unicorn = {
	// …
};

defineLazyProp(unicorn, 'rainbow', () => expensiveComputation());

app.on('user-action', () => {
	doSomething(unicorn.rainbow);
});
```
*/

```

