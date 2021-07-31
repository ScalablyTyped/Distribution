package typings.awsSdk.mediastoredataMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaStoreData extends Service {
  
  @JSName("config")
  var config_MediaStoreData: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Deletes an object at the specified path.
    */
  def deleteObject(): Request[DeleteObjectResponse, AWSError] = js.native
  def deleteObject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]): Request[DeleteObjectResponse, AWSError] = js.native
  /**
    * Deletes an object at the specified path.
    */
  def deleteObject(params: DeleteObjectRequest): Request[DeleteObjectResponse, AWSError] = js.native
  def deleteObject(
    params: DeleteObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteObjectResponse, Unit]
  ): Request[DeleteObjectResponse, AWSError] = js.native
  
  /**
    * Gets the headers for an object at the specified path.
    */
  def describeObject(): Request[DescribeObjectResponse, AWSError] = js.native
  def describeObject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectResponse, Unit]): Request[DescribeObjectResponse, AWSError] = js.native
  /**
    * Gets the headers for an object at the specified path.
    */
  def describeObject(params: DescribeObjectRequest): Request[DescribeObjectResponse, AWSError] = js.native
  def describeObject(
    params: DescribeObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeObjectResponse, Unit]
  ): Request[DescribeObjectResponse, AWSError] = js.native
  
  /**
    * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
    */
  def getObject(): Request[GetObjectResponse, AWSError] = js.native
  def getObject(callback: js.Function2[/* err */ AWSError, /* data */ GetObjectResponse, Unit]): Request[GetObjectResponse, AWSError] = js.native
  /**
    * Downloads the object at the specified path. If the object’s upload availability is set to streaming, AWS Elemental MediaStore downloads the object even if it’s still uploading the object.
    */
  def getObject(params: GetObjectRequest): Request[GetObjectResponse, AWSError] = js.native
  def getObject(
    params: GetObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetObjectResponse, Unit]
  ): Request[GetObjectResponse, AWSError] = js.native
  
  /**
    * Provides a list of metadata entries about folders and objects in the specified folder.
    */
  def listItems(): Request[ListItemsResponse, AWSError] = js.native
  def listItems(callback: js.Function2[/* err */ AWSError, /* data */ ListItemsResponse, Unit]): Request[ListItemsResponse, AWSError] = js.native
  /**
    * Provides a list of metadata entries about folders and objects in the specified folder.
    */
  def listItems(params: ListItemsRequest): Request[ListItemsResponse, AWSError] = js.native
  def listItems(
    params: ListItemsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListItemsResponse, Unit]
  ): Request[ListItemsResponse, AWSError] = js.native
  
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
    */
  def putObject(): Request[PutObjectResponse, AWSError] = js.native
  def putObject(callback: js.Function2[/* err */ AWSError, /* data */ PutObjectResponse, Unit]): Request[PutObjectResponse, AWSError] = js.native
  /**
    * Uploads an object to the specified path. Object sizes are limited to 25 MB for standard upload availability and 10 MB for streaming upload availability.
    */
  def putObject(params: PutObjectRequest): Request[PutObjectResponse, AWSError] = js.native
  def putObject(
    params: PutObjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutObjectResponse, Unit]
  ): Request[PutObjectResponse, AWSError] = js.native
}
