package typings
package cleanDashCssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cleanDashCssMod {
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
  type OptionsOutput = OptionsBase with cleanDashCssLib.Anon_False
  /**
    * Options when returning a promise
    */
  type OptionsPromise = OptionsBase with cleanDashCssLib.Anon_ReturnPromise
  /**
    * Hash of input source(s).  Passing an array of hashes allows you to explicitly specify the order in which the input files
    *  are concatenated. Whereas when you use a single hash the order is determined by the traversal order of object properties
    */
  type Source = /**
    * Path to file
    */
  org.scalablytyped.runtime.StringDictionary[cleanDashCssLib.Anon_SourceMap]
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = java.lang.String | (js.Array[Source | java.lang.String]) | Source | nodeLib.Buffer
}
