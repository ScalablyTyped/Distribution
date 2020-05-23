package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateQualificationTypeRequest extends js.Object {
  /**
    * The answers to the Qualification test specified in the Test parameter, in the form of an AnswerKey data structure. Constraints: Must not be longer than 65535 bytes. Constraints: None. If not specified, you must process Qualification requests manually.
    */
  var AnswerKey: js.UndefOr[String] = js.native
  /**
    * Specifies whether requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Constraints: If the Test parameter is specified, this parameter cannot be true.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.native
  /**
    * The Qualification value to use for automatically granted Qualifications. This parameter is used only if the AutoGranted parameter is true.
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.native
  /**
    * A long description for the Qualification type. On the Amazon Mechanical Turk website, the long description is displayed when a Worker examines a Qualification type.
    */
  var Description: String = js.native
  /**
    * One or more words or phrases that describe the Qualification type, separated by commas. The keywords of a type make the type easier to find during a search.
    */
  var Keywords: js.UndefOr[String] = js.native
  /**
    *  The name you give to the Qualification type. The type name is used to represent the Qualification to Workers, and to find the type using a Qualification type search. It must be unique across all of your Qualification types.
    */
  var Name: String = js.native
  /**
    * The initial status of the Qualification type. Constraints: Valid values are: Active | Inactive
    */
  var QualificationTypeStatus: typings.awsSdk.mturkMod.QualificationTypeStatus = js.native
  /**
    * The number of seconds that a Worker must wait after requesting a Qualification of the Qualification type before the worker can retry the Qualification request. Constraints: None. If not specified, retries are disabled and Workers can request a Qualification of this type only once, even if the Worker has not been granted the Qualification. It is not possible to disable retries for a Qualification type after it has been created with retries enabled. If you want to disable retries, you must delete existing retry-enabled Qualification type and then create a new Qualification type with retries disabled.
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    *  The questions for the Qualification test a Worker must answer correctly to obtain a Qualification of this type. If this parameter is specified, TestDurationInSeconds must also be specified.  Constraints: Must not be longer than 65535 bytes. Must be a QuestionForm data structure. This parameter cannot be specified if AutoGranted is true. Constraints: None. If not specified, the Worker may request the Qualification without answering any questions.
    */
  var Test: js.UndefOr[String] = js.native
  /**
    * The number of seconds the Worker has to complete the Qualification test, starting from the time the Worker requests the Qualification.
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.native
}

object CreateQualificationTypeRequest {
  @scala.inline
  def apply(
    Description: String,
    Name: String,
    QualificationTypeStatus: QualificationTypeStatus,
    AnswerKey: String = null,
    AutoGranted: js.UndefOr[Boolean] = js.undefined,
    AutoGrantedValue: js.UndefOr[Integer] = js.undefined,
    Keywords: String = null,
    RetryDelayInSeconds: js.UndefOr[Long] = js.undefined,
    Test: String = null,
    TestDurationInSeconds: js.UndefOr[Long] = js.undefined
  ): CreateQualificationTypeRequest = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], QualificationTypeStatus = QualificationTypeStatus.asInstanceOf[js.Any])
    if (AnswerKey != null) __obj.updateDynamic("AnswerKey")(AnswerKey.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoGranted)) __obj.updateDynamic("AutoGranted")(AutoGranted.get.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoGrantedValue)) __obj.updateDynamic("AutoGrantedValue")(AutoGrantedValue.get.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (!js.isUndefined(RetryDelayInSeconds)) __obj.updateDynamic("RetryDelayInSeconds")(RetryDelayInSeconds.get.asInstanceOf[js.Any])
    if (Test != null) __obj.updateDynamic("Test")(Test.asInstanceOf[js.Any])
    if (!js.isUndefined(TestDurationInSeconds)) __obj.updateDynamic("TestDurationInSeconds")(TestDurationInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateQualificationTypeRequest]
  }
}

