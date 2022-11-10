package typings.cypress.Cypress

import org.scalablytyped.runtime.StringDictionary
import typings.cypress.Mocha.Context
import typings.cypress.anon.PartialBrowser
import typings.cypress.typesSinonMod.SinonSpy
import typings.std.Exclude
import typings.std.Parameters
import typings.std.Pick
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Agent[T /* <: SinonSpy[js.Array[Any], Any] */] = SinonSpyAgent[T] & T

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.stable
  - typings.cypress.cypressStrings.canary
  - typings.cypress.cypressStrings.beta
  - typings.cypress.cypressStrings.dev
  - typings.cypress.cypressStrings.nightly
  - java.lang.String
*/
type BrowserChannel = _BrowserChannel | String

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.electron
  - typings.cypress.cypressStrings.chrome
  - typings.cypress.cypressStrings.chromium
  - typings.cypress.cypressStrings.firefox
  - typings.cypress.cypressStrings.edge
  - java.lang.String
*/
type BrowserName = _BrowserName | String

type CanReturnChainable = Unit | Chainable[Any] | js.Promise[Any]

type CommandFn[T /* <: /* keyof cypress.Cypress.ChainableMethods<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.cypress.cypressStrings.as, typings.cypress.cypressStrings.title, typings.cypress.cypressStrings.clearLocalStorage */ Any */] = js.ThisFunction1[
/* this */ Context, 
/* args */ Parameters[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
], 
(ReturnType[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
]) | Unit]

type CommandFnWithOriginalFn[T /* <: /* keyof cypress.Cypress.Chainable<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.cypress.cypressStrings.and, typings.cypress.cypressStrings.as, typings.cypress.cypressStrings.selectFile */ Any */] = js.ThisFunction2[
/* this */ Context, 
/* originalFn */ CommandOriginalFn[T], 
/* args */ Parameters[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
], 
(ReturnType[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
]) | Unit]

type CommandFnWithOriginalFnAndSubject[T /* <: /* keyof cypress.Cypress.Chainable<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.cypress.cypressStrings.and, typings.cypress.cypressStrings.as, typings.cypress.cypressStrings.selectFile */ Any */, S] = js.ThisFunction3[
/* this */ Context, 
/* originalFn */ CommandOriginalFnWithSubject[T, S], 
/* prevSubject */ S, 
/* args */ Parameters[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
], 
(ReturnType[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
]) | Unit]

type CommandFnWithSubject[T /* <: /* keyof cypress.Cypress.ChainableMethods<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88, starting with typings.cypress.cypressStrings.as, typings.cypress.cypressStrings.title, typings.cypress.cypressStrings.clearLocalStorage */ Any */, S] = js.ThisFunction2[
/* this */ Context, 
/* prevSubject */ S, 
/* args */ Parameters[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
], 
(ReturnType[
  /* import warning: importer.ImportType#apply Failed type conversion: cypress.Cypress.ChainableMethods<any>[T] */ js.Any
]) | Unit]

type CommandFns = StringDictionary[js.ThisFunction1[/* this */ Context, /* args */ Any, Any]]

type CommandFnsWithSubject[S] = StringDictionary[js.ThisFunction2[/* this */ Context, /* prevSubject */ S, /* args */ Any, Any]]

type ConfigHandler[T] = T | (js.Function0[T | js.Promise[T]])

type DefineDevServerConfig = // This interface can be extended by the user, to inject the types for their
// preferred bundler: e.g.
//
// import type * as webpack from 'webpack'
// declare global {
//   namespace Cypress {
//     interface DefineDevServerConfig {
//       webpackConfig?: webpack.Configuration
//     }
//   }
// }
StringDictionary[Any]

type DevServerFn[ComponentDevServerOpts] = js.Function2[
/* cypressDevServerConfig */ DevServerConfig, 
/* devServerConfig */ ComponentDevServerOpts, 
ResolvedDevServerConfig | js.Promise[ResolvedDevServerConfig]]

// Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
type Diff[T /* <: String */, U /* <: String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any

/* Rewritten from type alias, can be one of: 
  - typings.cypress.cypressStrings.ascii
  - typings.cypress.cypressStrings.base64
  - typings.cypress.cypressStrings.binary
  - typings.cypress.cypressStrings.hex
  - typings.cypress.cypressStrings.latin1
  - typings.cypress.cypressStrings.utf8
  - typings.cypress.cypressStrings.`utf-8`
  - typings.cypress.cypressStrings.ucs2
  - typings.cypress.cypressStrings.`ucs-2`
  - typings.cypress.cypressStrings.utf16le
  - typings.cypress.cypressStrings.`utf-16le`
  - scala.Null
*/
type Encodings = _Encodings | Null

type FileContents = String | js.Array[Any] | js.Object

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.cypress.BufferType
  - typings.cypress.Cypress.FileReferenceObject
*/
type FileReference = _FileReference | String

type HttpMethod = String

/* Rewritten from type alias, can be one of: 
  - typings.cypress.Cypress.BrowserName
  - typings.cypress.anon.PartialBrowser
  - js.Array[typings.cypress.Cypress.BrowserName | typings.cypress.anon.PartialBrowser]
*/
type IsBrowserMatcher = _IsBrowserMatcher | (js.Array[BrowserName | PartialBrowser]) | String

type Nullable[T] = T | Null

type ObjectLike = StringDictionary[Any]

type Omit[T, K /* <: /* keyof T */ String */] = Pick[T, Exclude[/* keyof T */ String, K]]

type Padding = Double | js.Array[Double] | (js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double]) | (js.Tuple4[Double, Double, Double, Double])

type PluginConfig = js.Function2[
/* on */ PluginEvents, 
/* config */ PluginConfigOptions, 
Unit | ConfigOptions[Any] | js.Promise[ConfigOptions[Any]]]

type RequestBody = String | js.Object

/**
  * Individual task callback. Receives a single argument and _should_ return
  * anything but `undefined` or a promise that resolves anything but `undefined`
  * TODO: find a way to express "anything but undefined" in TypeScript
  */
type Task = js.Function1[/* value */ Any, Any]

type Tasks = StringDictionary[Task]

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  R extends void ? cypress.Cypress.Chainable<S> : R extends R | undefined ? cypress.Cypress.Chainable<S | std.Exclude<R, undefined>> : cypress.Cypress.Chainable<S>
  }}}
  */
type ThenReturn[S, R] = Chainable[S]

/**
  * Public interface for the global "cy" object. If you want to add
  * a custom property to this object, you should extend this interface.
  * @see https://on.cypress.io/typescript#Types-for-custom-commands
  *
  ```
  // in your TS file
  declare namespace Cypress {
  interface cy {
  // declare additional properties on "cy" object, like
  // label: string
  }
  interface Chainable {
  // declare additional custom commands as methods, like
  // login(username: string, password: string)
  }
  }
  ```
  */
type cy = Chainable[Unit]
