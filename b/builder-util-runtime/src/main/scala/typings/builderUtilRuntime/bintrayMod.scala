package typings.builderUtilRuntime

import typings.builderUtilRuntime.cancellationTokenMod.CancellationToken
import typings.builderUtilRuntime.httpExecutorMod.HttpExecutor
import typings.builderUtilRuntime.httpExecutorMod.RequestHeaders
import typings.builderUtilRuntime.publishOptionsMod.BintrayOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bintrayMod {
  
  @JSImport("builder-util-runtime/out/bintray", "BintrayClient")
  @js.native
  class BintrayClient protected () extends StObject {
    def this(options: BintrayOptions, httpExecutor: HttpExecutor[js.Any], cancellationToken: CancellationToken) = this()
    def this(
      options: BintrayOptions,
      httpExecutor: HttpExecutor[js.Any],
      cancellationToken: CancellationToken,
      apiKey: String
    ) = this()
    
    val auth: String | Null = js.native
    
    val basePath: js.Any = js.native
    
    var bintrayRequest: js.Any = js.native
    
    val cancellationToken: js.Any = js.native
    
    val component: String | Null = js.native
    
    def createVersion(version: String): js.Promise[js.Any] = js.native
    
    def deleteVersion(version: String): js.Promise[js.Any] = js.native
    
    val distribution: String | Null = js.native
    
    def getVersion(version: String): js.Promise[Version] = js.native
    
    def getVersionFiles(version: String): js.Promise[js.Array[File]] = js.native
    
    val httpExecutor: js.Any = js.native
    
    val owner: String = js.native
    
    val packageName: String = js.native
    
    val repo: String = js.native
    
    var requestHeaders: js.Any = js.native
    
    def setRequestHeaders(): Unit = js.native
    def setRequestHeaders(value: RequestHeaders): Unit = js.native
    
    val user: String = js.native
  }
  
  trait File extends StObject {
    
    var name: String
    
    var path: String
    
    var sha1: String
    
    var sha256: String
  }
  object File {
    
    @scala.inline
    def apply(name: String, path: String, sha1: String, sha256: String): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    @scala.inline
    implicit class FileMutableBuilder[Self <: File] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
    }
  }
  
  trait Version extends StObject {
    
    @JSName("package")
    val _package: String
    
    val name: String
  }
  object Version {
    
    @scala.inline
    def apply(_package: String, name: String): Version = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    @scala.inline
    implicit class VersionMutableBuilder[Self <: Version] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
}
