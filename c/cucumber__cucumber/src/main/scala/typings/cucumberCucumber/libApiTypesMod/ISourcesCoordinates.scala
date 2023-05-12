package typings.cucumberCucumber.libApiTypesMod

import typings.cucumberCucumber.libModelsPickleOrderMod.PickleOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISourcesCoordinates extends StObject {
  
  var defaultDialect: String
  
  var names: js.Array[String]
  
  var order: PickleOrder
  
  var paths: js.Array[String]
  
  var tagExpression: String
}
object ISourcesCoordinates {
  
  inline def apply(
    defaultDialect: String,
    names: js.Array[String],
    order: PickleOrder,
    paths: js.Array[String],
    tagExpression: String
  ): ISourcesCoordinates = {
    val __obj = js.Dynamic.literal(defaultDialect = defaultDialect.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], tagExpression = tagExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISourcesCoordinates]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISourcesCoordinates] (val x: Self) extends AnyVal {
    
    inline def setDefaultDialect(value: String): Self = StObject.set(x, "defaultDialect", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setOrder(value: PickleOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setTagExpression(value: String): Self = StObject.set(x, "tagExpression", value.asInstanceOf[js.Any])
  }
}
