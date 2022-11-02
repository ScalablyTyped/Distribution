package typings.datadogPprof

import typings.datadogPprof.outSrcSourcemapperSourcemapperMod.SourceMapper
import typings.datadogPprof.outSrcV8TypesMod.AllocationProfileNode
import typings.datadogPprof.outSrcV8TypesMod.CpuProfile
import typings.datadogPprof.outSrcV8TypesMod.TimeProfile
import typings.pprofFormat.mod.Profile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcProfileSerializerMod {
  
  @JSImport("@datadog/pprof/out/src/profile-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  
  inline def serializeHeapProfile(prof: AllocationProfileNode, startTimeNanos: Double, intervalBytes: Double): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String
  ): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String,
    sourceMapper: SourceMapper
  ): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: Unit,
    sourceMapper: SourceMapper
  ): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
  
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[Profile]
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double, sourceMapper: SourceMapper): Profile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[Profile]
}
