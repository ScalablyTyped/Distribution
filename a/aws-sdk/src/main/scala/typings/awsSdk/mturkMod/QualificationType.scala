package typings.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QualificationType extends js.Object {
  /**
    * The answers to the Qualification test specified in the Test parameter.
    */
  var AnswerKey: js.UndefOr[String] = js.native
  /**
    * Specifies that requests for the Qualification type are granted immediately, without prompting the Worker with a Qualification test. Valid values are True | False.
    */
  var AutoGranted: js.UndefOr[Boolean] = js.native
  /**
    *  The Qualification integer value to use for automatically granted Qualifications, if AutoGranted is true. This is 1 by default. 
    */
  var AutoGrantedValue: js.UndefOr[Integer] = js.native
  /**
    *  The date and time the Qualification type was created. 
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  /**
    *  A long description for the Qualification type. 
    */
  var Description: js.UndefOr[String] = js.native
  /**
    *  Specifies whether the Qualification type is one that a user can request through the Amazon Mechanical Turk web site, such as by taking a Qualification test. This value is False for Qualifications assigned automatically by the system. Valid values are True | False. 
    */
  var IsRequestable: js.UndefOr[Boolean] = js.native
  /**
    *  One or more words or phrases that describe theQualification type, separated by commas. The Keywords make the type easier to find using a search. 
    */
  var Keywords: js.UndefOr[String] = js.native
  /**
    *  The name of the Qualification type. The type name is used to identify the type, and to find the type using a Qualification type search. 
    */
  var Name: js.UndefOr[String] = js.native
  /**
    *  A unique identifier for the Qualification type. A Qualification type is given a Qualification type ID when you call the CreateQualificationType operation. 
    */
  var QualificationTypeId: js.UndefOr[EntityId] = js.native
  /**
    *  The status of the Qualification type. A Qualification type's status determines if users can apply to receive a Qualification of this type, and if HITs can be created with requirements based on this type. Valid values are Active | Inactive. 
    */
  var QualificationTypeStatus: js.UndefOr[typings.awsSdk.mturkMod.QualificationTypeStatus] = js.native
  /**
    *  The amount of time, in seconds, Workers must wait after taking the Qualification test before they can take it again. Workers can take a Qualification test multiple times if they were not granted the Qualification from a previous attempt, or if the test offers a gradient score and they want a better score. If not specified, retries are disabled and Workers can request a Qualification only once. 
    */
  var RetryDelayInSeconds: js.UndefOr[Long] = js.native
  /**
    *  The questions for a Qualification test associated with this Qualification type that a user can take to obtain a Qualification of this type. This parameter must be specified if AnswerKey is present. A Qualification type cannot have both a specified Test parameter and an AutoGranted value of true. 
    */
  var Test: js.UndefOr[String] = js.native
  /**
    *  The amount of time, in seconds, given to a Worker to complete the Qualification test, beginning from the time the Worker requests the Qualification. 
    */
  var TestDurationInSeconds: js.UndefOr[Long] = js.native
}

object QualificationType {
  @scala.inline
  def apply(
    AnswerKey: String = null,
    AutoGranted: js.UndefOr[scala.Boolean] = js.undefined,
    AutoGrantedValue: Int | Double = null,
    CreationTime: Timestamp = null,
    Description: String = null,
    IsRequestable: js.UndefOr[scala.Boolean] = js.undefined,
    Keywords: String = null,
    Name: String = null,
    QualificationTypeId: EntityId = null,
    QualificationTypeStatus: QualificationTypeStatus = null,
    RetryDelayInSeconds: Int | Double = null,
    Test: String = null,
    TestDurationInSeconds: Int | Double = null
  ): QualificationType = {
    val __obj = js.Dynamic.literal()
    if (AnswerKey != null) __obj.updateDynamic("AnswerKey")(AnswerKey.asInstanceOf[js.Any])
    if (!js.isUndefined(AutoGranted)) __obj.updateDynamic("AutoGranted")(AutoGranted.asInstanceOf[js.Any])
    if (AutoGrantedValue != null) __obj.updateDynamic("AutoGrantedValue")(AutoGrantedValue.asInstanceOf[js.Any])
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(IsRequestable)) __obj.updateDynamic("IsRequestable")(IsRequestable.asInstanceOf[js.Any])
    if (Keywords != null) __obj.updateDynamic("Keywords")(Keywords.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (QualificationTypeId != null) __obj.updateDynamic("QualificationTypeId")(QualificationTypeId.asInstanceOf[js.Any])
    if (QualificationTypeStatus != null) __obj.updateDynamic("QualificationTypeStatus")(QualificationTypeStatus.asInstanceOf[js.Any])
    if (RetryDelayInSeconds != null) __obj.updateDynamic("RetryDelayInSeconds")(RetryDelayInSeconds.asInstanceOf[js.Any])
    if (Test != null) __obj.updateDynamic("Test")(Test.asInstanceOf[js.Any])
    if (TestDurationInSeconds != null) __obj.updateDynamic("TestDurationInSeconds")(TestDurationInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QualificationType]
  }
}

