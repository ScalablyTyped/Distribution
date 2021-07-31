package typings.awsSdk.kinesisanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParallelism extends StObject {
  
  /**
    * Number of in-application streams to create. For more information, see Limits. 
    */
  var Count: js.UndefOr[InputParallelismCount] = js.undefined
}
object InputParallelism {
  
  @scala.inline
  def apply(): InputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParallelism]
  }
  
  @scala.inline
  implicit class InputParallelismMutableBuilder[Self <: InputParallelism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: InputParallelismCount): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "Count", js.undefined)
  }
}
