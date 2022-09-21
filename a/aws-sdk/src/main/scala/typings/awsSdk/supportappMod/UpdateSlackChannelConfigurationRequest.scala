package typings.awsSdk.supportappMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSlackChannelConfigurationRequest extends StObject {
  
  /**
    * The channel ID in Slack. This ID identifies a channel within a Slack workspace.
    */
  var channelId: typings.awsSdk.supportappMod.channelId
  
  /**
    * The Slack channel name that you want to update.
    */
  var channelName: js.UndefOr[typings.awsSdk.supportappMod.channelName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an IAM role that you want to use to perform operations on Amazon Web Services. For more information, see Managing access to the Amazon Web Services Support App in the Amazon Web Services Support User Guide.
    */
  var channelRoleArn: js.UndefOr[roleArn] = js.undefined
  
  /**
    * Whether you want to get notified when a support case has a new correspondence.
    */
  var notifyOnAddCorrespondenceToCase: js.UndefOr[booleanValue] = js.undefined
  
  /**
    * The case severity for a support case that you want to receive notifications.  &lt;p&gt;If you specify &lt;code&gt;high&lt;/code&gt; or &lt;code&gt;all&lt;/code&gt;, at least one of the following parameters must be &lt;code&gt;true&lt;/code&gt;:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnAddCorrespondenceToCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnCreateOrReopenCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnResolveCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;p&gt;If you specify &lt;code&gt;none&lt;/code&gt;, any of the following parameters that you specify in your request must be &lt;code&gt;false&lt;/code&gt;:&lt;/p&gt; &lt;ul&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnAddCorrespondenceToCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnCreateOrReopenCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;li&gt; &lt;p&gt; &lt;code&gt;notifyOnResolveCase&lt;/code&gt; &lt;/p&gt; &lt;/li&gt; &lt;/ul&gt; &lt;note&gt; &lt;p&gt;If you don't specify these parameters in your request, the Amazon Web Services Support App uses the current values by default.&lt;/p&gt; &lt;/note&gt; 
    */
  var notifyOnCaseSeverity: js.UndefOr[NotificationSeverityLevel] = js.undefined
  
  /**
    * Whether you want to get notified when a support case is created or reopened.
    */
  var notifyOnCreateOrReopenCase: js.UndefOr[booleanValue] = js.undefined
  
  /**
    * Whether you want to get notified when a support case is resolved.
    */
  var notifyOnResolveCase: js.UndefOr[booleanValue] = js.undefined
  
  /**
    * The team ID in Slack. This ID uniquely identifies a Slack workspace.
    */
  var teamId: typings.awsSdk.supportappMod.teamId
}
object UpdateSlackChannelConfigurationRequest {
  
  inline def apply(channelId: channelId, teamId: teamId): UpdateSlackChannelConfigurationRequest = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], teamId = teamId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSlackChannelConfigurationRequest]
  }
  
  extension [Self <: UpdateSlackChannelConfigurationRequest](x: Self) {
    
    inline def setChannelId(value: channelId): Self = StObject.set(x, "channelId", value.asInstanceOf[js.Any])
    
    inline def setChannelName(value: channelName): Self = StObject.set(x, "channelName", value.asInstanceOf[js.Any])
    
    inline def setChannelNameUndefined: Self = StObject.set(x, "channelName", js.undefined)
    
    inline def setChannelRoleArn(value: roleArn): Self = StObject.set(x, "channelRoleArn", value.asInstanceOf[js.Any])
    
    inline def setChannelRoleArnUndefined: Self = StObject.set(x, "channelRoleArn", js.undefined)
    
    inline def setNotifyOnAddCorrespondenceToCase(value: booleanValue): Self = StObject.set(x, "notifyOnAddCorrespondenceToCase", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnAddCorrespondenceToCaseUndefined: Self = StObject.set(x, "notifyOnAddCorrespondenceToCase", js.undefined)
    
    inline def setNotifyOnCaseSeverity(value: NotificationSeverityLevel): Self = StObject.set(x, "notifyOnCaseSeverity", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnCaseSeverityUndefined: Self = StObject.set(x, "notifyOnCaseSeverity", js.undefined)
    
    inline def setNotifyOnCreateOrReopenCase(value: booleanValue): Self = StObject.set(x, "notifyOnCreateOrReopenCase", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnCreateOrReopenCaseUndefined: Self = StObject.set(x, "notifyOnCreateOrReopenCase", js.undefined)
    
    inline def setNotifyOnResolveCase(value: booleanValue): Self = StObject.set(x, "notifyOnResolveCase", value.asInstanceOf[js.Any])
    
    inline def setNotifyOnResolveCaseUndefined: Self = StObject.set(x, "notifyOnResolveCase", js.undefined)
    
    inline def setTeamId(value: teamId): Self = StObject.set(x, "teamId", value.asInstanceOf[js.Any])
  }
}
