package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ButtonType extends StObject
@JSImport("azdata", "ButtonType")
@js.native
object ButtonType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ButtonType & String] = js.native
  
  /**
    * Opens up the File Picker dialog when clicked
    */
  @js.native
  sealed trait File
    extends StObject
       with ButtonType
  /* "File" */ val File: typings.azdata.mod.ButtonType.File & String = js.native
  
  /**
    * Button that displays additional information when hovered over
    */
  @js.native
  sealed trait Informational
    extends StObject
       with ButtonType
  /* "Informational" */ val Informational: typings.azdata.mod.ButtonType.Informational & String = js.native
  
  /**
    * Normal button with no special behavior
    */
  @js.native
  sealed trait Normal
    extends StObject
       with ButtonType
  /* "Normal" */ val Normal: typings.azdata.mod.ButtonType.Normal & String = js.native
}
