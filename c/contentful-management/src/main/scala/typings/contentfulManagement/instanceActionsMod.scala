package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.EntityPath
import typings.contentfulManagement.anon.EntityPathHttp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceActionsMod {
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createArchiveEntity")
  @js.native
  def createArchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createArchivedChecker")
  @js.native
  def createArchivedChecker(): js.Function0[Boolean] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createDeleteEntity")
  @js.native
  def createDeleteEntity(hasHttpEntityPath: EntityPathHttp): js.Function0[js.Promise[Unit]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createDraftChecker")
  @js.native
  def createDraftChecker(): js.Function0[Boolean] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createPublishEntity")
  @js.native
  def createPublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createPublishedChecker")
  @js.native
  def createPublishedChecker(): js.Function0[Boolean] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createUnarchiveEntity")
  @js.native
  def createUnarchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createUnpublishEntity")
  @js.native
  def createUnpublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createUpdateEntity")
  @js.native
  def createUpdateEntity[T](hasHttpEntityPathWrapperMethodHeaders: EntityPath[T]): js.Function0[js.Promise[T]] = js.native
  
  @JSImport("contentful-management/dist/typings/instance-actions", "createUpdatedChecker")
  @js.native
  def createUpdatedChecker(): js.Function0[Boolean] = js.native
  
  type WrapperMethod[E, A /* <: AxiosInstance */] = js.Function2[/* http */ A, /* data */ js.Any, E]
}
