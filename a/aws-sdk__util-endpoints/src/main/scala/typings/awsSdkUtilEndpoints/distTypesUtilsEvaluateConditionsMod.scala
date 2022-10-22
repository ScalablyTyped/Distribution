package typings.awsSdkUtilEndpoints

import typings.awsSdkUtilEndpoints.anon.ReferenceRecord
import typings.awsSdkUtilEndpoints.anon.ReferenceRecordResult
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.ConditionObject
import typings.awsSdkUtilEndpoints.distTypesTypesSharedMod.EvaluateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesUtilsEvaluateConditionsMod {
  
  @JSImport("@aws-sdk/util-endpoints/dist-types/utils/evaluateConditions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def evaluateConditions(conditions: js.Array[ConditionObject], options: EvaluateOptions): ReferenceRecord | ReferenceRecordResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateConditions")(conditions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReferenceRecord | ReferenceRecordResult]
  inline def evaluateConditions(conditions: Unit, options: EvaluateOptions): ReferenceRecord | ReferenceRecordResult = (^.asInstanceOf[js.Dynamic].applyDynamic("evaluateConditions")(conditions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReferenceRecord | ReferenceRecordResult]
}
