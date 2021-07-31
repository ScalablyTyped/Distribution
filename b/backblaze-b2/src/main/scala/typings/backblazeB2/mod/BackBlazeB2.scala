package typings.backblazeB2.mod

import typings.backblazeB2.anon.applicationKeyIdstringCom
import typings.backblazeB2.anon.bucketIdstringCommonArgs
import typings.backblazeB2.anon.bucketIdstringfileNamestr
import typings.backblazeB2.anon.fileIdstringCommonArgs
import typings.backblazeB2.anon.fileIdstringDownloadFileO
import typings.backblazeB2.anon.fileIdstringfileNamestrin
import typings.backblazeB2.anon.fileIdstringpartSha1Array
import typings.backblazeB2.anon.maxKeyCountnumberstartApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackBlazeB2 extends StObject {
  
  def authorize(): js.Promise[StandardApiResponse] = js.native
  def authorize(opts: CommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def cancelLargeFile(opts: fileIdstringCommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def createBucket(opts: CreateBucketOpts): js.Promise[StandardApiResponse] = js.native
  
  def createKey(opts: CreateKeyOpts): js.Promise[StandardApiResponse] = js.native
  
  def deleteBucket(opts: bucketIdstringCommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def deleteFileVersion(opts: fileIdstringfileNamestrin): js.Promise[StandardApiResponse] = js.native
  
  def deleteKey(opts: applicationKeyIdstringCom): js.Promise[StandardApiResponse] = js.native
  
  def downloadFileById(opts: fileIdstringDownloadFileO): js.Promise[StandardApiResponse] = js.native
  
  def downloadFileByName(opts: DownlaodFileByNameOpts): js.Promise[StandardApiResponse] = js.native
  
  def finishLargeFile(opts: fileIdstringpartSha1Array): js.Promise[StandardApiResponse] = js.native
  
  def getBucket(opts: GetBucketOpts): js.Promise[StandardApiResponse] = js.native
  
  def getDownloadAuthorization(opts: GetDownloadAuthorizationOpts): js.Promise[StandardApiResponse] = js.native
  
  def getFileInfo(opts: fileIdstringCommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def getUploadPartUrl(opts: fileIdstringCommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def getUploadUrl(opts: bucketIdstringCommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def hideFile(opts: bucketIdstringfileNamestr): js.Promise[StandardApiResponse] = js.native
  
  def listBuckets(): js.Promise[StandardApiResponse] = js.native
  def listBuckets(opts: CommonArgs): js.Promise[StandardApiResponse] = js.native
  
  def listFileNames(opts: ListFileNamesOpts): js.Promise[StandardApiResponse] = js.native
  
  def listFileVersions(opts: ListFileVersionsOpts): js.Promise[StandardApiResponse] = js.native
  
  def listKeys(opts: maxKeyCountnumberstartApp): js.Promise[StandardApiResponse] = js.native
  
  def listParts(opts: ListPartsOpts): js.Promise[StandardApiResponse] = js.native
  
  def startLargeFile(opts: bucketIdstringfileNamestr): js.Promise[StandardApiResponse] = js.native
  
  def updateBucket(opts: UpdateBucketOpts): js.Promise[StandardApiResponse] = js.native
  
  def uploadFile(opts: UploadFileOpts): js.Promise[StandardApiResponse] = js.native
  
  def uploadPart(opts: UploadPartOpts): js.Promise[StandardApiResponse] = js.native
}
