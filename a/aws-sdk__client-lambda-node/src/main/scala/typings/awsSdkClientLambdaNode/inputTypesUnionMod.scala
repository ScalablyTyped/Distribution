package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.`nodejs4Dot3-edge`
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore1Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot0
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.dotnetcore2Dot1
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.go1Dotx
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.java8
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs4Dot3
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs6Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.nodejs8Dot10
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python2Dot7
import typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.python3Dot6
import typings.awsSdkClientLambdaNode.typesFunctionCodeMod.FunctionCode
import typings.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput
import typings.node.streamMod.Readable
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput
    - typings.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput
    - typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput
    - typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput
    - typings.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput
    - typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput
    - typings.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput
    - typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput
    - typings.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput
    - typings.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput
    - typings.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput
    - typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput
    - typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput
    - typings.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput
    - typings.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput
    - typings.awsSdkClientLambdaNode.typesInvokeAsyncInputMod.InvokeAsyncInput[typings.node.streamMod.Readable]
    - typings.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput
    - typings.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput
    - typings.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput
    - typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput
    - typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput
    - typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput
    - typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput
    - typings.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput
    - typings.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput
    - typings.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput
    - typings.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput
    - typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput
    - typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput
    - typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput
  */
  type InputTypesUnion = _InputTypesUnion | InvokeAsyncInput[Readable]
  
  trait _InputTypesUnion extends StObject
  object _InputTypesUnion {
    
    @scala.inline
    def AddPermissionInput(Action: String, FunctionName: String, Principal: String, StatementId: String): typings.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput = {
      val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Principal = Principal.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesAddPermissionInputMod.AddPermissionInput]
    }
    
    @scala.inline
    def CreateAliasInput(FunctionName: String, FunctionVersion: String, Name: String): typings.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], FunctionVersion = FunctionVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesCreateAliasInputMod.CreateAliasInput]
    }
    
    @scala.inline
    def CreateEventSourceMappingInput(EventSourceArn: String, FunctionName: String): typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(EventSourceArn = EventSourceArn.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesCreateEventSourceMappingInputMod.CreateEventSourceMappingInput]
    }
    
    @scala.inline
    def CreateFunctionInput(
      Code: FunctionCode,
      FunctionName: String,
      Handler: String,
      Role: String,
      Runtime: nodejs | nodejs4Dot3 | nodejs6Dot10 | nodejs8Dot10 | java8 | python2Dot7 | python3Dot6 | dotnetcore1Dot0 | dotnetcore2Dot0 | dotnetcore2Dot1 | `nodejs4Dot3-edge` | go1Dotx | String
    ): typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput = {
      val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], FunctionName = FunctionName.asInstanceOf[js.Any], Handler = Handler.asInstanceOf[js.Any], Role = Role.asInstanceOf[js.Any], Runtime = Runtime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesCreateFunctionInputMod.CreateFunctionInput]
    }
    
    @scala.inline
    def DeleteAliasInput(FunctionName: String, Name: String): typings.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesDeleteAliasInputMod.DeleteAliasInput]
    }
    
    @scala.inline
    def DeleteEventSourceMappingInput(UUID: String): typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesDeleteEventSourceMappingInputMod.DeleteEventSourceMappingInput]
    }
    
    @scala.inline
    def DeleteFunctionConcurrencyInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesDeleteFunctionConcurrencyInputMod.DeleteFunctionConcurrencyInput]
    }
    
    @scala.inline
    def DeleteFunctionInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesDeleteFunctionInputMod.DeleteFunctionInput]
    }
    
    @scala.inline
    def GetAccountSettingsInput(): typings.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetAccountSettingsInputMod.GetAccountSettingsInput]
    }
    
    @scala.inline
    def GetAliasInput(FunctionName: String, Name: String): typings.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetAliasInputMod.GetAliasInput]
    }
    
    @scala.inline
    def GetEventSourceMappingInput(UUID: String): typings.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetEventSourceMappingInputMod.GetEventSourceMappingInput]
    }
    
    @scala.inline
    def GetFunctionConfigurationInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetFunctionConfigurationInputMod.GetFunctionConfigurationInput]
    }
    
    @scala.inline
    def GetFunctionInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetFunctionInputMod.GetFunctionInput]
    }
    
    @scala.inline
    def GetPolicyInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesGetPolicyInputMod.GetPolicyInput]
    }
    
    @scala.inline
    def InvokeInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvokeInputMod.InvokeInput]
    }
    
    @scala.inline
    def ListAliasesInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesListAliasesInputMod.ListAliasesInput]
    }
    
    @scala.inline
    def ListEventSourceMappingsInput(): typings.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesListEventSourceMappingsInputMod.ListEventSourceMappingsInput]
    }
    
    @scala.inline
    def ListFunctionsInput(): typings.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesListFunctionsInputMod.ListFunctionsInput]
    }
    
    @scala.inline
    def ListTagsInput(Resource: String): typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesListTagsInputMod.ListTagsInput]
    }
    
    @scala.inline
    def ListVersionsByFunctionInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesListVersionsByFunctionInputMod.ListVersionsByFunctionInput]
    }
    
    @scala.inline
    def PublishVersionInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPublishVersionInputMod.PublishVersionInput]
    }
    
    @scala.inline
    def PutFunctionConcurrencyInput(FunctionName: String, ReservedConcurrentExecutions: Double): typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], ReservedConcurrentExecutions = ReservedConcurrentExecutions.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPutFunctionConcurrencyInputMod.PutFunctionConcurrencyInput]
    }
    
    @scala.inline
    def RemovePermissionInput(FunctionName: String, StatementId: String): typings.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], StatementId = StatementId.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesRemovePermissionInputMod.RemovePermissionInput]
    }
    
    @scala.inline
    def TagResourceInput(Resource: String, Tags: StringDictionary[String] | (Iterable[js.Tuple2[String, String]])): typings.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(Resource: String, TagKeys: js.Array[String] | Iterable[String]): typings.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(Resource = Resource.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateAliasInput(FunctionName: String, Name: String): typings.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesUpdateAliasInputMod.UpdateAliasInput]
    }
    
    @scala.inline
    def UpdateEventSourceMappingInput(UUID: String): typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesUpdateEventSourceMappingInputMod.UpdateEventSourceMappingInput]
    }
    
    @scala.inline
    def UpdateFunctionCodeInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesUpdateFunctionCodeInputMod.UpdateFunctionCodeInput]
    }
    
    @scala.inline
    def UpdateFunctionConfigurationInput(FunctionName: String): typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput = {
      val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesUpdateFunctionConfigurationInputMod.UpdateFunctionConfigurationInput]
    }
  }
}
