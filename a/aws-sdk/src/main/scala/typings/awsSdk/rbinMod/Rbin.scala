package typings.awsSdk.rbinMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rbin extends Service {
  
  @JSName("config")
  var config_Rbin: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a Recycle Bin retention rule. For more information, see  Create Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def createRule(): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]): Request[CreateRuleResponse, AWSError] = js.native
  /**
    * Creates a Recycle Bin retention rule. For more information, see  Create Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def createRule(params: CreateRuleRequest): Request[CreateRuleResponse, AWSError] = js.native
  def createRule(
    params: CreateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRuleResponse, Unit]
  ): Request[CreateRuleResponse, AWSError] = js.native
  
  /**
    * Deletes a Recycle Bin retention rule. For more information, see  Delete Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteRule(): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]): Request[DeleteRuleResponse, AWSError] = js.native
  /**
    * Deletes a Recycle Bin retention rule. For more information, see  Delete Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def deleteRule(params: DeleteRuleRequest): Request[DeleteRuleResponse, AWSError] = js.native
  def deleteRule(
    params: DeleteRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRuleResponse, Unit]
  ): Request[DeleteRuleResponse, AWSError] = js.native
  
  /**
    * Gets information about a Recycle Bin retention rule.
    */
  def getRule(): Request[GetRuleResponse, AWSError] = js.native
  def getRule(callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]): Request[GetRuleResponse, AWSError] = js.native
  /**
    * Gets information about a Recycle Bin retention rule.
    */
  def getRule(params: GetRuleRequest): Request[GetRuleResponse, AWSError] = js.native
  def getRule(
    params: GetRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRuleResponse, Unit]
  ): Request[GetRuleResponse, AWSError] = js.native
  
  /**
    * Lists the Recycle Bin retention rules in the Region.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Lists the Recycle Bin retention rules in the Region.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  
  /**
    * Lists the tags assigned to a retention rule.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Lists the tags assigned to a retention rule.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  
  /**
    * Assigns tags to the specified retention rule.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Assigns tags to the specified retention rule.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Unassigns a tag from a retention rule.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Unassigns a tag from a retention rule.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates an existing Recycle Bin retention rule. For more information, see  Update Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def updateRule(): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]): Request[UpdateRuleResponse, AWSError] = js.native
  /**
    * Updates an existing Recycle Bin retention rule. For more information, see  Update Recycle Bin retention rules in the Amazon Elastic Compute Cloud User Guide.
    */
  def updateRule(params: UpdateRuleRequest): Request[UpdateRuleResponse, AWSError] = js.native
  def updateRule(
    params: UpdateRuleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRuleResponse, Unit]
  ): Request[UpdateRuleResponse, AWSError] = js.native
}
