package typings.chrome.chrome.system

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @js.native
  trait CpuInfo extends StObject {
    
    /** The architecture name of the processors. */
    var archName: String = js.native
    
    /**
      * A set of feature codes indicating some of the processor's capabilities.
      * The currently supported codes are "mmx", "sse", "sse2", "sse3", "ssse3", "sse4_1", "sse4_2", and "avx".
      */
    var features: js.Array[String] = js.native
    
    /** The model name of the processors. */
    var modelName: String = js.native
    
    /** The number of logical processors. */
    var numOfProcessors: Double = js.native
    
    /** Information about each logical processor. */
    var processors: js.Array[ProcessorInfo] = js.native
  }
  object CpuInfo {
    
    @scala.inline
    def apply(
      archName: String,
      features: js.Array[String],
      modelName: String,
      numOfProcessors: Double,
      processors: js.Array[ProcessorInfo]
    ): CpuInfo = {
      val __obj = js.Dynamic.literal(archName = archName.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], numOfProcessors = numOfProcessors.asInstanceOf[js.Any], processors = processors.asInstanceOf[js.Any])
      __obj.asInstanceOf[CpuInfo]
    }
    
    @scala.inline
    implicit class CpuInfoMutableBuilder[Self <: CpuInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArchName(value: String): Self = StObject.set(x, "archName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatures(value: js.Array[String]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeaturesVarargs(value: String*): Self = StObject.set(x, "features", js.Array(value :_*))
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumOfProcessors(value: Double): Self = StObject.set(x, "numOfProcessors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessors(value: js.Array[ProcessorInfo]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessorsVarargs(value: ProcessorInfo*): Self = StObject.set(x, "processors", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ProcessorInfo extends StObject {
    
    /** Cumulative usage info for this logical processor. */
    var usage: ProcessorUsage = js.native
  }
  object ProcessorInfo {
    
    @scala.inline
    def apply(usage: ProcessorUsage): ProcessorInfo = {
      val __obj = js.Dynamic.literal(usage = usage.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorInfo]
    }
    
    @scala.inline
    implicit class ProcessorInfoMutableBuilder[Self <: ProcessorInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsage(value: ProcessorUsage): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProcessorUsage extends StObject {
    
    /** The cumulative time spent idle by this processor. */
    var idle: Double = js.native
    
    /** The cumulative time used by kernel programs on this processor. */
    var kernel: Double = js.native
    
    /** The total cumulative time for this processor. This value is equal to user + kernel + idle. */
    var total: Double = js.native
    
    /** The cumulative time used by userspace programs on this processor. */
    var user: Double = js.native
  }
  object ProcessorUsage {
    
    @scala.inline
    def apply(idle: Double, kernel: Double, total: Double, user: Double): ProcessorUsage = {
      val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], kernel = kernel.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessorUsage]
    }
    
    @scala.inline
    implicit class ProcessorUsageMutableBuilder[Self <: ProcessorUsage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernel(value: Double): Self = StObject.set(x, "kernel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUser(value: Double): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    }
  }
}
