package typings.awsSdk.dataexchangeMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataExchange extends Service {
  @JSName("config")
  var config_DataExchange: ConfigBase with ClientConfiguration = js.native
  /**
    * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
    */
  def cancelJob(): Request[js.Object, AWSError] = js.native
  def cancelJob(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation cancels a job. Jobs can be cancelled only when they are in the WAITING state.
    */
  def cancelJob(params: CancelJobRequest): Request[js.Object, AWSError] = js.native
  def cancelJob(params: CancelJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation creates a data set.
    */
  def createDataSet(): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * This operation creates a data set.
    */
  def createDataSet(params: CreateDataSetRequest): Request[CreateDataSetResponse, AWSError] = js.native
  def createDataSet(
    params: CreateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDataSetResponse, Unit]
  ): Request[CreateDataSetResponse, AWSError] = js.native
  /**
    * This operation creates a job.
    */
  def createJob(): Request[CreateJobResponse, AWSError] = js.native
  def createJob(callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]): Request[CreateJobResponse, AWSError] = js.native
  /**
    * This operation creates a job.
    */
  def createJob(params: CreateJobRequest): Request[CreateJobResponse, AWSError] = js.native
  def createJob(
    params: CreateJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateJobResponse, Unit]
  ): Request[CreateJobResponse, AWSError] = js.native
  /**
    * This operation creates a revision for a data set.
    */
  def createRevision(): Request[CreateRevisionResponse, AWSError] = js.native
  def createRevision(callback: js.Function2[/* err */ AWSError, /* data */ CreateRevisionResponse, Unit]): Request[CreateRevisionResponse, AWSError] = js.native
  /**
    * This operation creates a revision for a data set.
    */
  def createRevision(params: CreateRevisionRequest): Request[CreateRevisionResponse, AWSError] = js.native
  def createRevision(
    params: CreateRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRevisionResponse, Unit]
  ): Request[CreateRevisionResponse, AWSError] = js.native
  /**
    * This operation deletes an asset.
    */
  def deleteAsset(): Request[js.Object, AWSError] = js.native
  def deleteAsset(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation deletes an asset.
    */
  def deleteAsset(params: DeleteAssetRequest): Request[js.Object, AWSError] = js.native
  def deleteAsset(params: DeleteAssetRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation deletes a data set.
    */
  def deleteDataSet(): Request[js.Object, AWSError] = js.native
  def deleteDataSet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation deletes a data set.
    */
  def deleteDataSet(params: DeleteDataSetRequest): Request[js.Object, AWSError] = js.native
  def deleteDataSet(
    params: DeleteDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * This operation deletes a revision.
    */
  def deleteRevision(): Request[js.Object, AWSError] = js.native
  def deleteRevision(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation deletes a revision.
    */
  def deleteRevision(params: DeleteRevisionRequest): Request[js.Object, AWSError] = js.native
  def deleteRevision(
    params: DeleteRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * This operation returns information about an asset.
    */
  def getAsset(): Request[GetAssetResponse, AWSError] = js.native
  def getAsset(callback: js.Function2[/* err */ AWSError, /* data */ GetAssetResponse, Unit]): Request[GetAssetResponse, AWSError] = js.native
  /**
    * This operation returns information about an asset.
    */
  def getAsset(params: GetAssetRequest): Request[GetAssetResponse, AWSError] = js.native
  def getAsset(
    params: GetAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAssetResponse, Unit]
  ): Request[GetAssetResponse, AWSError] = js.native
  /**
    * This operation returns information about a data set.
    */
  def getDataSet(): Request[GetDataSetResponse, AWSError] = js.native
  def getDataSet(callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetResponse, Unit]): Request[GetDataSetResponse, AWSError] = js.native
  /**
    * This operation returns information about a data set.
    */
  def getDataSet(params: GetDataSetRequest): Request[GetDataSetResponse, AWSError] = js.native
  def getDataSet(
    params: GetDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataSetResponse, Unit]
  ): Request[GetDataSetResponse, AWSError] = js.native
  /**
    * This operation returns information about a job.
    */
  def getJob(): Request[GetJobResponse, AWSError] = js.native
  def getJob(callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * This operation returns information about a job.
    */
  def getJob(params: GetJobRequest): Request[GetJobResponse, AWSError] = js.native
  def getJob(params: GetJobRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetJobResponse, Unit]): Request[GetJobResponse, AWSError] = js.native
  /**
    * This operation returns information about a revision.
    */
  def getRevision(): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]): Request[GetRevisionResponse, AWSError] = js.native
  /**
    * This operation returns information about a revision.
    */
  def getRevision(params: GetRevisionRequest): Request[GetRevisionResponse, AWSError] = js.native
  def getRevision(
    params: GetRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRevisionResponse, Unit]
  ): Request[GetRevisionResponse, AWSError] = js.native
  /**
    * This operation lists a data set's revisions sorted by CreatedAt in descending order.
    */
  def listDataSetRevisions(): Request[ListDataSetRevisionsResponse, AWSError] = js.native
  def listDataSetRevisions(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetRevisionsResponse, Unit]): Request[ListDataSetRevisionsResponse, AWSError] = js.native
  /**
    * This operation lists a data set's revisions sorted by CreatedAt in descending order.
    */
  def listDataSetRevisions(params: ListDataSetRevisionsRequest): Request[ListDataSetRevisionsResponse, AWSError] = js.native
  def listDataSetRevisions(
    params: ListDataSetRevisionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetRevisionsResponse, Unit]
  ): Request[ListDataSetRevisionsResponse, AWSError] = js.native
  /**
    * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
    */
  def listDataSets(): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * This operation lists your data sets. When listing by origin OWNED, results are sorted by CreatedAt in descending order. When listing by origin ENTITLED, there is no order and the maxResults parameter is ignored.
    */
  def listDataSets(params: ListDataSetsRequest): Request[ListDataSetsResponse, AWSError] = js.native
  def listDataSets(
    params: ListDataSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDataSetsResponse, Unit]
  ): Request[ListDataSetsResponse, AWSError] = js.native
  /**
    * This operation lists your jobs sorted by CreatedAt in descending order.
    */
  def listJobs(): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]): Request[ListJobsResponse, AWSError] = js.native
  /**
    * This operation lists your jobs sorted by CreatedAt in descending order.
    */
  def listJobs(params: ListJobsRequest): Request[ListJobsResponse, AWSError] = js.native
  def listJobs(
    params: ListJobsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListJobsResponse, Unit]
  ): Request[ListJobsResponse, AWSError] = js.native
  /**
    * This operation lists a revision's assets sorted alphabetically in descending order.
    */
  def listRevisionAssets(): Request[ListRevisionAssetsResponse, AWSError] = js.native
  def listRevisionAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListRevisionAssetsResponse, Unit]): Request[ListRevisionAssetsResponse, AWSError] = js.native
  /**
    * This operation lists a revision's assets sorted alphabetically in descending order.
    */
  def listRevisionAssets(params: ListRevisionAssetsRequest): Request[ListRevisionAssetsResponse, AWSError] = js.native
  def listRevisionAssets(
    params: ListRevisionAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRevisionAssetsResponse, Unit]
  ): Request[ListRevisionAssetsResponse, AWSError] = js.native
  /**
    * This operation lists the tags on the resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * This operation lists the tags on the resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * This operation starts a job.
    */
  def startJob(): Request[StartJobResponse, AWSError] = js.native
  def startJob(callback: js.Function2[/* err */ AWSError, /* data */ StartJobResponse, Unit]): Request[StartJobResponse, AWSError] = js.native
  /**
    * This operation starts a job.
    */
  def startJob(params: StartJobRequest): Request[StartJobResponse, AWSError] = js.native
  def startJob(
    params: StartJobRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartJobResponse, Unit]
  ): Request[StartJobResponse, AWSError] = js.native
  /**
    * This operation tags a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation tags a resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation removes one or more tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * This operation removes one or more tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * This operation updates an asset.
    */
  def updateAsset(): Request[UpdateAssetResponse, AWSError] = js.native
  def updateAsset(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetResponse, Unit]): Request[UpdateAssetResponse, AWSError] = js.native
  /**
    * This operation updates an asset.
    */
  def updateAsset(params: UpdateAssetRequest): Request[UpdateAssetResponse, AWSError] = js.native
  def updateAsset(
    params: UpdateAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAssetResponse, Unit]
  ): Request[UpdateAssetResponse, AWSError] = js.native
  /**
    * This operation updates a data set.
    */
  def updateDataSet(): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * This operation updates a data set.
    */
  def updateDataSet(params: UpdateDataSetRequest): Request[UpdateDataSetResponse, AWSError] = js.native
  def updateDataSet(
    params: UpdateDataSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDataSetResponse, Unit]
  ): Request[UpdateDataSetResponse, AWSError] = js.native
  /**
    * This operation updates a revision.
    */
  def updateRevision(): Request[UpdateRevisionResponse, AWSError] = js.native
  def updateRevision(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRevisionResponse, Unit]): Request[UpdateRevisionResponse, AWSError] = js.native
  /**
    * This operation updates a revision.
    */
  def updateRevision(params: UpdateRevisionRequest): Request[UpdateRevisionResponse, AWSError] = js.native
  def updateRevision(
    params: UpdateRevisionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRevisionResponse, Unit]
  ): Request[UpdateRevisionResponse, AWSError] = js.native
}

