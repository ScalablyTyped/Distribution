package typings.chartJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofTooltip extends StObject {
  
  val additionalOptionScopes: js.Array[String]
  
  def afterDraw(chart: Any): Unit
  
  def afterEvent(chart: Any, args: Any): Unit
  
  def afterInit(chart: Any, _args: Any, options: Any): Unit
  
  def beforeUpdate(chart: Any, _args: Any, options: Any): Unit
  
  val defaultRoutes: TypeofdefaultRoutesBodyFont1
  
  val defaults: TypeofdefaultsAnimation
  
  val descriptors: TypeofdescriptorsAnimation1
  
  val id: String
  
  def reset(chart: Any, _args: Any, options: Any): Unit
}
object TypeofTooltip {
  
  inline def apply(
    additionalOptionScopes: js.Array[String],
    afterDraw: Any => Unit,
    afterEvent: (Any, Any) => Unit,
    afterInit: (Any, Any, Any) => Unit,
    beforeUpdate: (Any, Any, Any) => Unit,
    defaultRoutes: TypeofdefaultRoutesBodyFont1,
    defaults: TypeofdefaultsAnimation,
    descriptors: TypeofdescriptorsAnimation1,
    id: String,
    reset: (Any, Any, Any) => Unit
  ): TypeofTooltip = {
    val __obj = js.Dynamic.literal(additionalOptionScopes = additionalOptionScopes.asInstanceOf[js.Any], afterDraw = js.Any.fromFunction1(afterDraw), afterEvent = js.Any.fromFunction2(afterEvent), afterInit = js.Any.fromFunction3(afterInit), beforeUpdate = js.Any.fromFunction3(beforeUpdate), defaultRoutes = defaultRoutes.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], descriptors = descriptors.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], reset = js.Any.fromFunction3(reset))
    __obj.asInstanceOf[TypeofTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofTooltip] (val x: Self) extends AnyVal {
    
    inline def setAdditionalOptionScopes(value: js.Array[String]): Self = StObject.set(x, "additionalOptionScopes", value.asInstanceOf[js.Any])
    
    inline def setAdditionalOptionScopesVarargs(value: String*): Self = StObject.set(x, "additionalOptionScopes", js.Array(value*))
    
    inline def setAfterDraw(value: Any => Unit): Self = StObject.set(x, "afterDraw", js.Any.fromFunction1(value))
    
    inline def setAfterEvent(value: (Any, Any) => Unit): Self = StObject.set(x, "afterEvent", js.Any.fromFunction2(value))
    
    inline def setAfterInit(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "afterInit", js.Any.fromFunction3(value))
    
    inline def setBeforeUpdate(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction3(value))
    
    inline def setDefaultRoutes(value: TypeofdefaultRoutesBodyFont1): Self = StObject.set(x, "defaultRoutes", value.asInstanceOf[js.Any])
    
    inline def setDefaults(value: TypeofdefaultsAnimation): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDescriptors(value: TypeofdescriptorsAnimation1): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReset(value: (Any, Any, Any) => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction3(value))
  }
}
