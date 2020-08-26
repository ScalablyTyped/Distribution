package typings.awsSdk.marketplacecommerceanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSupportDataExportRequest extends js.Object {
  /**
    * (Optional) Key-value pairs which will be returned, unmodified, in the Amazon SNS notification message and the data set metadata file.
    */
  var customerDefinedValues: js.UndefOr[CustomerDefinedValues] = js.native
  /**
    *  Specifies the data set type to be written to the output csv file. The data set types customer_support_contacts_data and test_customer_support_contacts_data both result in a csv file containing the following fields: Product Id, Product Code, Customer Guid, Subscription Guid, Subscription Start Date, Organization, AWS Account Id, Given Name, Surname, Telephone Number, Email, Title, Country Code, ZIP Code, Operation Type, and Operation Time.    customer_support_contacts_data Customer support contact data. The data set will contain all changes (Creates, Updates, and Deletes) to customer support contact data from the date specified in the from_date parameter. test_customer_support_contacts_data An example data set containing static test data in the same format as customer_support_contacts_data  
    */
  var dataSetType: SupportDataSetType = js.native
  /**
    * The name (friendly name, not ARN) of the destination S3 bucket.
    */
  var destinationS3BucketName: DestinationS3BucketName = js.native
  /**
    * (Optional) The desired S3 prefix for the published data set, similar to a directory path in standard file systems. For example, if given the bucket name "mybucket" and the prefix "myprefix/mydatasets", the output file "outputfile" would be published to "s3://mybucket/myprefix/mydatasets/outputfile". If the prefix directory structure does not exist, it will be created. If no prefix is provided, the data set will be published to the S3 bucket root.
    */
  var destinationS3Prefix: js.UndefOr[DestinationS3Prefix] = js.native
  /**
    * The start date from which to retrieve the data set in UTC. This parameter only affects the customer_support_contacts_data data set type.
    */
  var fromDate: FromDate = js.native
  /**
    * The Amazon Resource Name (ARN) of the Role with an attached permissions policy to interact with the provided AWS services.
    */
  var roleNameArn: RoleNameArn = js.native
  /**
    * Amazon Resource Name (ARN) for the SNS Topic that will be notified when the data set has been published or if an error has occurred.
    */
  var snsTopicArn: SnsTopicArn = js.native
}

object StartSupportDataExportRequest {
  @scala.inline
  def apply(
    dataSetType: SupportDataSetType,
    destinationS3BucketName: DestinationS3BucketName,
    fromDate: FromDate,
    roleNameArn: RoleNameArn,
    snsTopicArn: SnsTopicArn
  ): StartSupportDataExportRequest = {
    val __obj = js.Dynamic.literal(dataSetType = dataSetType.asInstanceOf[js.Any], destinationS3BucketName = destinationS3BucketName.asInstanceOf[js.Any], fromDate = fromDate.asInstanceOf[js.Any], roleNameArn = roleNameArn.asInstanceOf[js.Any], snsTopicArn = snsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSupportDataExportRequest]
  }
  @scala.inline
  implicit class StartSupportDataExportRequestOps[Self <: StartSupportDataExportRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDataSetType(value: SupportDataSetType): Self = this.set("dataSetType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestinationS3BucketName(value: DestinationS3BucketName): Self = this.set("destinationS3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFromDate(value: FromDate): Self = this.set("fromDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleNameArn(value: RoleNameArn): Self = this.set("roleNameArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnsTopicArn(value: SnsTopicArn): Self = this.set("snsTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerDefinedValues(value: CustomerDefinedValues): Self = this.set("customerDefinedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerDefinedValues: Self = this.set("customerDefinedValues", js.undefined)
    @scala.inline
    def setDestinationS3Prefix(value: DestinationS3Prefix): Self = this.set("destinationS3Prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestinationS3Prefix: Self = this.set("destinationS3Prefix", js.undefined)
  }
  
}

