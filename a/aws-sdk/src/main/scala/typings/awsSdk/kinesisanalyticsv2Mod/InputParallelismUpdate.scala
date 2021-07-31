package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParallelismUpdate extends StObject {
  
  /**
    * The number of in-application streams to create for the specified streaming source.
    */
  var CountUpdate: InputParallelismCount
}
object InputParallelismUpdate {
  
  @scala.inline
  def apply(CountUpdate: InputParallelismCount): InputParallelismUpdate = {
    val __obj = js.Dynamic.literal(CountUpdate = CountUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParallelismUpdate]
  }
  
  @scala.inline
  implicit class InputParallelismUpdateMutableBuilder[Self <: InputParallelismUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountUpdate(value: InputParallelismCount): Self = StObject.set(x, "CountUpdate", value.asInstanceOf[js.Any])
  }
}
