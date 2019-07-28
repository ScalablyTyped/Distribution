package typings.bdfjs.bdfjsMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Font extends js.Object {
  var glyphs: NumberDictionary[Glyph]
  var meta: Meta
}

object Font {
  @scala.inline
  def apply(glyphs: NumberDictionary[Glyph], meta: Meta): Font = {
    val __obj = js.Dynamic.literal(glyphs = glyphs, meta = meta)
  
    __obj.asInstanceOf[Font]
  }
}

