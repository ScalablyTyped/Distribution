package typings.datadogPprof

import typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
import typings.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import typings.pprofFormat.mod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcHeapProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/heap-profiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object CallbackMode {
    
    @JSImport("@datadog/pprof/out/src/heap-profiler", "CallbackMode")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@datadog/pprof/out/src/heap-profiler", "CallbackMode.Async")
    @js.native
    def Async: Double = js.native
    inline def Async_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Async")(x.asInstanceOf[js.Any])
    
    @JSImport("@datadog/pprof/out/src/heap-profiler", "CallbackMode.Both")
    @js.native
    def Both: Double = js.native
    inline def Both_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Both")(x.asInstanceOf[js.Any])
    
    @JSImport("@datadog/pprof/out/src/heap-profiler", "CallbackMode.Interrupt")
    @js.native
    def Interrupt: Double = js.native
    inline def Interrupt_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Interrupt")(x.asInstanceOf[js.Any])
  }
  
  inline def convertProfile(rootNode: AllocationProfileNode): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("convertProfile")(rootNode.asInstanceOf[js.Any]).asInstanceOf[Profile]
  inline def convertProfile(rootNode: AllocationProfileNode, ignoreSamplePath: String): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProfile")(rootNode.asInstanceOf[js.Any], ignoreSamplePath.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def convertProfile(rootNode: AllocationProfileNode, ignoreSamplePath: String, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProfile")(rootNode.asInstanceOf[js.Any], ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def convertProfile(rootNode: AllocationProfileNode, ignoreSamplePath: Unit, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("convertProfile")(rootNode.asInstanceOf[js.Any], ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String],
    callback: Unit,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String],
    callback: NearHeapLimitCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: js.Array[String],
    callback: NearHeapLimitCallback,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: Unit,
    callback: Unit,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: Unit,
    callback: NearHeapLimitCallback
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def monitorOutOfMemory(
    heapLimitExtensionSize: Double,
    maxHeapLimitExtensionCount: Double,
    dumpHeapProfileOnSdterr: Boolean,
    exportCommand: Unit,
    callback: NearHeapLimitCallback,
    callbackMode: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("monitorOutOfMemory")(heapLimitExtensionSize.asInstanceOf[js.Any], maxHeapLimitExtensionCount.asInstanceOf[js.Any], dumpHeapProfileOnSdterr.asInstanceOf[js.Any], exportCommand.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], callbackMode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def profile(): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")().asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: String): Profile = ^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any]).asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: String, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def profile(ignoreSamplePath: Unit, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("profile")(ignoreSamplePath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  
  inline def start(intervalBytes: Double, stackDepth: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(intervalBytes.asInstanceOf[js.Any], stackDepth.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
  
  inline def v8Profile(): AllocationProfileNode = ^.asInstanceOf[js.Dynamic].applyDynamic("v8Profile")().asInstanceOf[AllocationProfileNode]
  
  type NearHeapLimitCallback = js.Function1[/* profile */ Profile, Unit]
}
