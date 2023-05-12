package typings.csstoolsMediaQueryListParser.anon

import typings.csstoolsCssParserAlgorithms.distConsumeConsumeComponentBlockFunctionMod.ComponentValue
import typings.csstoolsMediaQueryListParser.distUtilNodeTypeMod.NodeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  var media: js.Array[ComponentValue]
  
  var string: java.lang.String
  
  var `type`: NodeType
}
object String {
  
  inline def apply(media: js.Array[ComponentValue], string: java.lang.String, `type`: NodeType): String = {
    val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    inline def setMedia(value: js.Array[ComponentValue]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaVarargs(value: ComponentValue*): Self = StObject.set(x, "media", js.Array(value*))
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setType(value: NodeType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
