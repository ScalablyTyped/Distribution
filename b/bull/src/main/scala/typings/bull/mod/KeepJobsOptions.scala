package typings.bull.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specify which jobs to keep after finishing processing this job.
  * If both age and count are specified, then the jobs kept will be the ones that satisfies both properties.
  */
trait KeepJobsOptions extends StObject {
  
  /**
    * Maximum age in *seconds* for job to be kept.
    */
  var age: js.UndefOr[Double] = js.undefined
  
  /**
    * Maximum count of jobs to be kept.
    */
  var count: js.UndefOr[Double] = js.undefined
}
object KeepJobsOptions {
  
  inline def apply(): KeepJobsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeepJobsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeepJobsOptions] (val x: Self) extends AnyVal {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAgeUndefined: Self = StObject.set(x, "age", js.undefined)
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
