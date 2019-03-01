package typings
package cleanDashCssLib.cleanDashCssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CleanCSSNs {
  /**
    * Callback type when fetch is used
    */
  type FetchCallback = js.Function2[
    /* message */ java.lang.String | scala.Double, 
    /* body */ java.lang.String, 
    scala.Unit
  ]
  /**
    * Discriminant union of both sets of options types.  If you initialize without setting `returnPromise: true`
    *  and want to return a promise, you will need to cast to the correct options type so that TypeScript
    *  knows what the expected return type will be:
    *  `(options = options as CleanCSS.OptionsPromise).returnPromise = true`
    */
  type Options = OptionsPromise | OptionsOutput
  /**
    * Options when returning an output
    */
  type OptionsOutput = cleanDashCssLib.cleanDashCssMod.OptionsBase with cleanDashCssLib.Anon_False
  /**
    * Options when returning a promise
    */
  type OptionsPromise = cleanDashCssLib.cleanDashCssMod.OptionsBase with cleanDashCssLib.Anon_ReturnPromise
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = java.lang.String | js.Array[java.lang.String] | Source | js.Array[Source] | nodeLib.Buffer
}
