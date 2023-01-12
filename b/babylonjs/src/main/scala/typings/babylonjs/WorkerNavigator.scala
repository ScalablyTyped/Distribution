package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerNavigator extends StObject {
  
  val gpu: js.UndefOr[GPU] = js.undefined
}
object WorkerNavigator {
  
  inline def apply(): WorkerNavigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkerNavigator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkerNavigator] (val x: Self) extends AnyVal {
    
    inline def setGpu(value: GPU): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
    
    inline def setGpuUndefined: Self = StObject.set(x, "gpu", js.undefined)
  }
}
