package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait InvalidatedProjectKind extends StObject
@JSGlobal("ts.InvalidatedProjectKind")
@js.native
object InvalidatedProjectKind extends StObject {
  
  @js.native
  sealed trait Build
    extends StObject
       with InvalidatedProjectKind
  
  @js.native
  sealed trait UpdateBundle
    extends StObject
       with InvalidatedProjectKind
  
  @js.native
  sealed trait UpdateOutputFileStamps
    extends StObject
       with InvalidatedProjectKind
}
