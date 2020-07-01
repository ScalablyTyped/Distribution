package typings.awsSdk.honeycodeMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Honeycode extends Service {
  @JSName("config")
  var config_Honeycode: ConfigBase with ClientConfiguration = js.native
  /**
    *  The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 
    */
  def getScreenData(): Request[GetScreenDataResult, AWSError] = js.native
  def getScreenData(callback: js.Function2[/* err */ AWSError, /* data */ GetScreenDataResult, Unit]): Request[GetScreenDataResult, AWSError] = js.native
  /**
    *  The GetScreenData API allows retrieval of data from a screen in a Honeycode app. The API allows setting local variables in the screen to filter, sort or otherwise affect what will be displayed on the screen. 
    */
  def getScreenData(params: GetScreenDataRequest): Request[GetScreenDataResult, AWSError] = js.native
  def getScreenData(
    params: GetScreenDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetScreenDataResult, Unit]
  ): Request[GetScreenDataResult, AWSError] = js.native
  /**
    *  The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 
    */
  def invokeScreenAutomation(): Request[InvokeScreenAutomationResult, AWSError] = js.native
  def invokeScreenAutomation(callback: js.Function2[/* err */ AWSError, /* data */ InvokeScreenAutomationResult, Unit]): Request[InvokeScreenAutomationResult, AWSError] = js.native
  /**
    *  The InvokeScreenAutomation API allows invoking an action defined in a screen in a Honeycode app. The API allows setting local variables, which can then be used in the automation being invoked. This allows automating the Honeycode app interactions to write, update or delete data in the workbook. 
    */
  def invokeScreenAutomation(params: InvokeScreenAutomationRequest): Request[InvokeScreenAutomationResult, AWSError] = js.native
  def invokeScreenAutomation(
    params: InvokeScreenAutomationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InvokeScreenAutomationResult, Unit]
  ): Request[InvokeScreenAutomationResult, AWSError] = js.native
}

