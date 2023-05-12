package typings.datastoreCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcErrorsMod {
  
  @JSImport("datastore-core/dist/src/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def abortedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")().asInstanceOf[js.Error]
  inline def abortedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("abortedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def dbDeleteFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")().asInstanceOf[js.Error]
  inline def dbDeleteFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDeleteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def dbOpenFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")().asInstanceOf[js.Error]
  inline def dbOpenFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbOpenFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def dbReadFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbReadFailedError")().asInstanceOf[js.Error]
  inline def dbReadFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbReadFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def dbWriteFailedError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")().asInstanceOf[js.Error]
  inline def dbWriteFailedError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("dbWriteFailedError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def notFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")().asInstanceOf[js.Error]
  inline def notFoundError(err: js.Error): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("notFoundError")(err.asInstanceOf[js.Any]).asInstanceOf[js.Error]
}
