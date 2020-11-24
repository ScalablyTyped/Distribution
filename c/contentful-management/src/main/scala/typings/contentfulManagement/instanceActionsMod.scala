package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.EntityPath
import typings.contentfulManagement.anon.EntityPathHttp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("contentful-management/dist/typings/instance-actions", JSImport.Namespace)
@js.native
object instanceActionsMod extends js.Object {
  
  def createArchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  def createArchivedChecker(): js.Function0[Boolean] = js.native
  
  def createDeleteEntity(hasHttpEntityPath: EntityPathHttp): js.Function0[js.Promise[Unit]] = js.native
  
  def createDraftChecker(): js.Function0[Boolean] = js.native
  
  def createPublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  def createPublishedChecker(): js.Function0[Boolean] = js.native
  
  def createUnarchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  def createUnpublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  def createUpdateEntity[T](hasHttpEntityPathWrapperMethodHeaders: EntityPath[T]): js.Function0[js.Promise[T]] = js.native
  
  def createUpdatedChecker(): js.Function0[Boolean] = js.native
  
  type WrapperMethod[E, A /* <: AxiosInstance */] = js.Function2[/* http */ A, /* data */ js.Any, E]
}
