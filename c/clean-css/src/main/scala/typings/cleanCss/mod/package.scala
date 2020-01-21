package typings.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
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
  type Options = typings.cleanCss.mod.OptionsPromise | typings.cleanCss.mod.OptionsOutput
  /**
    * Options when returning an output
    */
  type OptionsOutput = typings.cleanCss.mod.OptionsBase with typings.cleanCss.AnonFalse
  /**
    * Options when returning a promise
    */
  type OptionsPromise = typings.cleanCss.mod.OptionsBase with typings.cleanCss.AnonReturnPromise
  /**
    * Hash of input source(s).  Passing an array of hashes allows you to explicitly specify the order in which the input files
    *  are concatenated. Whereas when you use a single hash the order is determined by the traversal order of object properties
    */
  type Source = /**
    * Path to file
    */
  org.scalablytyped.runtime.StringDictionary[typings.cleanCss.AnonSourceMap]
  /**
    * Union of all types acceptable as input for the minify function
    */
  type Sources = java.lang.String | (js.Array[typings.cleanCss.mod.Source | java.lang.String]) | typings.cleanCss.mod.Source | typings.node.Buffer
}
