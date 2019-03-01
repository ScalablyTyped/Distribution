package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var glyphs: org.scalablytyped.runtime.NumberDictionary[Glyph]
  var meta: Meta
}

object Font {
  @scala.inline
  def apply(glyphs: org.scalablytyped.runtime.NumberDictionary[Glyph], meta: Meta): Font = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glyphs")(glyphs)
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[Font]
  }
}

