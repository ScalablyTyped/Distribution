package typings.babelTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.babelTypes.mod.ObjectProperty_
  - typings.babelTypes.mod.ClassProperty_
*/
trait Property extends StObject
object Property {
  
  inline def ClassProperty_(end: Double, key: Identifier_, loc: SourceLocation, start: Double, value: Expression): typings.babelTypes.mod.ClassProperty_ = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ClassProperty_]
  }
  
  inline def ObjectProperty_(
    computed: Boolean,
    end: Double,
    key: Expression,
    loc: SourceLocation,
    shorthand: Boolean,
    start: Double,
    value: Expression
  ): typings.babelTypes.mod.ObjectProperty_ = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], shorthand = shorthand.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ObjectProperty")
    __obj.asInstanceOf[typings.babelTypes.mod.ObjectProperty_]
  }
}
