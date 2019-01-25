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
    * Union type for both types of minifier functions
    */
  type Minifier = MinifierOutput | MinifierPromise
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = java.lang.String | js.Array[java.lang.String] | Source | js.Array[Source] | nodeLib.Buffer
}
