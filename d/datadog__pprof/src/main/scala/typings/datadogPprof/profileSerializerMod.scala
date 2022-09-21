package typings.datadogPprof

import typings.datadogPprof.profileMod.perftools.profiles.IProfile
import typings.datadogPprof.sourcemapperMod.SourceMapper
import typings.datadogPprof.v8TypesMod.AllocationProfileNode
import typings.datadogPprof.v8TypesMod.CpuProfile
import typings.datadogPprof.v8TypesMod.TimeProfile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object profileSerializerMod {
  
  @JSImport("@datadog/pprof/out/src/profile-serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def serializeCpuProfile(prof: CpuProfile, intervalMicros: Double, sourceMapper: SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeCpuProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  
  inline def serializeHeapProfile(prof: AllocationProfileNode, startTimeNanos: Double, intervalBytes: Double): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String
  ): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: String,
    sourceMapper: SourceMapper
  ): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def serializeHeapProfile(
    prof: AllocationProfileNode,
    startTimeNanos: Double,
    intervalBytes: Double,
    ignoreSamplesPath: Unit,
    sourceMapper: SourceMapper
  ): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeHeapProfile")(prof.asInstanceOf[js.Any], startTimeNanos.asInstanceOf[js.Any], intervalBytes.asInstanceOf[js.Any], ignoreSamplesPath.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any])).asInstanceOf[IProfile]
  inline def serializeTimeProfile(prof: TimeProfile, intervalMicros: Double, sourceMapper: SourceMapper): IProfile = (^.asInstanceOf[js.Dynamic].applyDynamic("serializeTimeProfile")(prof.asInstanceOf[js.Any], intervalMicros.asInstanceOf[js.Any], sourceMapper.asInstanceOf[js.Any])).asInstanceOf[IProfile]
}
