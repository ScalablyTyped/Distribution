package typings.chrome.chrome.system

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// System CPU
////////////////////
/**
  * Use the system.cpu API to query CPU metadata.
  * Permissions: "system.cpu"
  * @since Chrome 32.
  */
object cpu {
  
  trait CpuInfo extends StObject {
    
    /** The architecture name of the processors. */
    var archName: String
    
    /**
      * A set of feature codes indicating some of the processor's capabilities.
      * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
      */
    var features: js.Array[String]
    
    /** The model name of the processors. */
    var modelName: String
    
    /** The number of logical processors. */
    var numOfProcessors: Double
    
    /** Information about each logical processor. */
    var processors: js.Array[ProcessorInfo]
  }
  object CpuInfo {
    
    inline def apply(
      archName: String,
      features: js.Array[String],
      modelName: String,
      numOfProcessors: Double,
      processors: js.Array[ProcessorInfo]
    ): CpuInfo = {
      val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    extension [Self <: CpuInfo](x: Self) {
      
      inline def setArchName(value: String): Self = StObject.set(x, "archName", value.asInstanceOf[js.Any])
      
      inline def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      inline def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setNumOfProcessors(value: Double): Self = StObject.set(x, "numOfProcessors", value.asInstanceOf[js.Any])
      
      inline def setProcessors(value: js.Array[ProcessorInfo]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      inline def setProcessorsVarargs(value: ProcessorInfo*): Self = StObject.set(x, "processors", js.Array(value :_*))
    }
  }
  
  trait ProcessorInfo extends StObject {
    
    /** Cumulative usage info for this logical processor. */
    var usage: ProcessorUsage
  }
  object ProcessorInfo {
    
    inline def apply(usage: ProcessorUsage): ProcessorInfo = {
      val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorInfo]
    }
    
    extension [Self <: ProcessorInfo](x: Self) {
      
      inline def setUsage(value: ProcessorUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProcessorUsage extends StObject {
    
    /** The cumulative time spent idle by this processor. */
    var idle: Double
    
    /** The cumulative time used by kernel programs on this processor. */
    var kernel: Double
    
    /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
    var total: Double
    
    /** The cumulative time used by userspace programs on this processor. */
    var user: Double
  }
  object ProcessorUsage {
    
    inline def apply(idle: Double, kernel: Double, total: Double, user: Double): ProcessorUsage = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorUsage]
    }
    
    extension [Self <: ProcessorUsage](x: Self) {
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setKernel(value: Double): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
