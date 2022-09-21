package typings.bson.mod

import typings.bson.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BSONRegExpExtended extends StObject {
  
  @JSName("$regularExpression")
  var $regularExpression: Options
}
object BSONRegExpExtended {
  
  inline def apply($regularExpression: Options): BSONRegExpExtended = {
    val __obj = js.Dynamic.literal($regularExpression = $regularExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSONRegExpExtended]
  }
  
  extension [Self <: BSONRegExpExtended](x: Self) {
    
    inline def set$regularExpression(value: Options): Self = StObject.set(x, "$regularExpression", value.asInstanceOf[js.Any])
  }
}
