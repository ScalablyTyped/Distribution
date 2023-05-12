package typings.awsSdk2Types.anon

import typings.awsSdk2Types.clientsSsmMod.CommandId
import typings.awsSdk2Types.clientsSsmMod.CommandPluginName
import typings.awsSdk2Types.clientsSsmMod.InstanceId
import typings.awsSdk2Types.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk2-types.aws-sdk2-types/clients/ssm.GetCommandInvocationRequest & {  $waiter :aws-sdk2-types.aws-sdk2-types/lib/service.WaiterConfiguration | undefined} */
trait GetCommandInvocationReque extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * (Required) The parent command ID of the invocation plugin.
    */
  var CommandId: typings.awsSdk2Types.clientsSsmMod.CommandId
  
  /**
    * (Required) The ID of the managed node targeted by the command. A managed node can be an Amazon Elastic Compute Cloud (Amazon EC2) instance, edge device, and on-premises server or VM in your hybrid environment that is configured for Amazon Web Services Systems Manager.
    */
  var InstanceId: typings.awsSdk2Types.clientsSsmMod.InstanceId
  
  /**
    * The name of the step for which you want detailed results. If the document contains only one step, you can omit the name and details for that step. If the document contains more than one step, you must specify the name of the step for which you want to view details. Be sure to specify the name of the step, not the name of a plugin like aws:RunShellScript. To find the PluginName, check the document content and find the name of the step you want details for. Alternatively, use ListCommandInvocations with the CommandId and Details parameters. The PluginName is the Name attribute of the CommandPlugin object in the CommandPlugins list.
    */
  var PluginName: js.UndefOr[CommandPluginName] = js.undefined
}
object GetCommandInvocationReque {
  
  inline def apply(CommandId: CommandId, InstanceId: InstanceId): GetCommandInvocationReque = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommandInvocationReque]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCommandInvocationReque] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setPluginName(value: CommandPluginName): Self = StObject.set(x, "PluginName", value.asInstanceOf[js.Any])
    
    inline def setPluginNameUndefined: Self = StObject.set(x, "PluginName", js.undefined)
  }
}
