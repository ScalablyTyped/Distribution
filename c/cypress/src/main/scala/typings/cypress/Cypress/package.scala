package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Cypress {
  type Agent[T /* <: typings.cypress.sinonMod.SinonSpy */] = typings.cypress.Cypress.SinonSpyAgent[T] with T
  type Backend = js.Function1[typings.cypress.cypressStrings.firefoxColonforceColongc, js.Promise[scala.Unit]]
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressStrings.stable
    - typings.cypress.cypressStrings.canary
    - typings.cypress.cypressStrings.beta
    - typings.cypress.cypressStrings.dev
    - typings.cypress.cypressStrings.nightly
    - java.lang.String
  */
  type BrowserChannel = typings.cypress.Cypress._BrowserChannel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.cypressStrings.electron
    - typings.cypress.cypressStrings.chrome
    - typings.cypress.cypressStrings.chromium
    - typings.cypress.cypressStrings.firefox
    - typings.cypress.cypressStrings.edge
    - java.lang.String
  */
  type BrowserName = typings.cypress.Cypress._BrowserName | java.lang.String
  type CanReturnChainable = scala.Unit | typings.cypress.Cypress.Chainable[js.Any]
  // Diff taken from https://github.com/Microsoft/TypeScript/issues/12215#issuecomment-311923766
  type Diff[T /* <: java.lang.String */, U /* <: java.lang.String */] = /* import warning: importer.ImportType#apply Failed type conversion: {[ P in T ]: P} & {[ P in U ]: never} & {[x: string] : never}[T] */ js.Any
  type FileContents = java.lang.String | js.Array[js.Any] | js.Object
  type HttpMethod = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.cypress.Cypress.BrowserName
    - typings.cypress.anon.PartialBrowser
    - js.Array[typings.cypress.Cypress.BrowserName | typings.cypress.anon.PartialBrowser]
  */
  type IsBrowserMatcher = typings.cypress.Cypress._IsBrowserMatcher | (js.Array[typings.cypress.Cypress.BrowserName | typings.cypress.anon.PartialBrowser]) | java.lang.String
  type ObjectLike = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  type Padding = scala.Double | js.Array[scala.Double] | (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double]) | (js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double])
  type PluginConfig = js.Function2[
    /* on */ typings.cypress.Cypress.PluginEvents, 
    /* config */ typings.cypress.Cypress.PluginConfigOptions, 
    scala.Unit | typings.cypress.Cypress.ConfigOptions | js.Promise[typings.cypress.Cypress.ConfigOptions]
  ]
  type RequestBody = java.lang.String | js.Object
  /**
    * Individual task callback. Receives a single argument and _should_ return
    * anything but `undefined` or a promise that resolves anything but `undefined`
    * TODO: find a way to express "anything but undefined" in TypeScript
    */
  type Task = js.Function1[/* value */ js.Any, js.Any]
  type Tasks = org.scalablytyped.runtime.StringDictionary[typings.cypress.Cypress.Task]
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
  type cy = typings.cypress.Cypress.Chainable[js.UndefOr[scala.Nothing]]
}
