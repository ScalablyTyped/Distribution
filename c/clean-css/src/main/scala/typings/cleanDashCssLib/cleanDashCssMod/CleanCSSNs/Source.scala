package typings
package cleanDashCssLib.cleanDashCssMod.CleanCSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Hash of input source(s).  Passing an array of hashes allows you to explicitly specify the order in which the input files
  *  are concatenated. Whereas when you use a single hash the order is determined by the traversal order of object properties
  */
trait Source
  extends /**
  * Path to file
  */
/* path */ org.scalablytyped.runtime.StringDictionary[cleanDashCssLib.Anon_SourceMap]

object Source {
  @scala.inline
  def apply(
    StringDictionary: /**
    * Path to file
    */
  /* path */ org.scalablytyped.runtime.StringDictionary[cleanDashCssLib.Anon_SourceMap] = null
  ): Source = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Source]
  }
}

