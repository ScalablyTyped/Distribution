package typings.broFs

import typings.broFs.mod.TextType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object broFsStrings {
  
  @js.native
  sealed trait ArrayBuffer extends StObject
  inline def ArrayBuffer: ArrayBuffer = "ArrayBuffer".asInstanceOf[ArrayBuffer]
  
  @js.native
  sealed trait BinaryString
    extends StObject
       with TextType
  inline def BinaryString: BinaryString = "BinaryString".asInstanceOf[BinaryString]
  
  @js.native
  sealed trait Blob extends StObject
  inline def Blob: Blob = "Blob".asInstanceOf[Blob]
  
  @js.native
  sealed trait DataURL
    extends StObject
       with TextType
  inline def DataURL: DataURL = "DataURL".asInstanceOf[DataURL]
  
  @js.native
  sealed trait File extends StObject
  inline def File: File = "File".asInstanceOf[File]
  
  @js.native
  sealed trait Text
    extends StObject
       with TextType
  inline def Text: Text = "Text".asInstanceOf[Text]
}
