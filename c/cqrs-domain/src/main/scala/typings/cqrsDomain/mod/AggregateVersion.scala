package typings.cqrsDomain.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregateVersion extends StObject {
  
  var version: Double
}
object AggregateVersion {
  
  @scala.inline
  def apply(version: Double): AggregateVersion = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateVersion]
  }
  
  @scala.inline
  implicit class AggregateVersionMutableBuilder[Self <: AggregateVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
