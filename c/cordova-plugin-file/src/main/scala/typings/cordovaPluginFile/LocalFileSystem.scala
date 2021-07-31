package typings.cordovaPluginFile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LocalFileSystem extends StObject
@JSGlobal("LocalFileSystem")
@js.native
object LocalFileSystem extends StObject {
  
  @js.native
  sealed trait PERSISTENT
    extends StObject
       with LocalFileSystem
  
  @js.native
  sealed trait TEMPORARY
    extends StObject
       with LocalFileSystem
}
