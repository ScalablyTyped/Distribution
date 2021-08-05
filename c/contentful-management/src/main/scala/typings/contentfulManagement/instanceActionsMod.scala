package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.anon.EntityPath
import typings.contentfulManagement.anon.EntityPathHttp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object instanceActionsMod {
  
  @JSImport("contentful-management/dist/typings/instance-actions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createArchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createArchiveEntity")(hasHttpEntityPathWrapperMethod.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
  
  inline def createArchivedChecker(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createArchivedChecker")().asInstanceOf[js.Function0[Boolean]]
  
  inline def createDeleteEntity(hasHttpEntityPath: EntityPathHttp): js.Function0[js.Promise[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDeleteEntity")(hasHttpEntityPath.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[Unit]]]
  
  inline def createDraftChecker(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDraftChecker")().asInstanceOf[js.Function0[Boolean]]
  
  inline def createPublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublishEntity")(hasHttpEntityPathWrapperMethod.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
  
  inline def createPublishedChecker(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createPublishedChecker")().asInstanceOf[js.Function0[Boolean]]
  
  inline def createUnarchiveEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnarchiveEntity")(hasHttpEntityPathWrapperMethod.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
  
  inline def createUnpublishEntity[T](hasHttpEntityPathWrapperMethod: typings.contentfulManagement.anon.WrapperMethod[T]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnpublishEntity")(hasHttpEntityPathWrapperMethod.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
  
  inline def createUpdateEntity[T](hasHttpEntityPathWrapperMethodHeaders: EntityPath[T]): js.Function0[js.Promise[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdateEntity")(hasHttpEntityPathWrapperMethodHeaders.asInstanceOf[js.Any]).asInstanceOf[js.Function0[js.Promise[T]]]
  
  inline def createUpdatedChecker(): js.Function0[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUpdatedChecker")().asInstanceOf[js.Function0[Boolean]]
  
  type WrapperMethod[E, A /* <: AxiosInstance */] = js.Function2[/* http */ A, /* data */ js.Any, E]
}
