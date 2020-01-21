package typings.broFs

import typings.broFs.mod.TextType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object broFsStrings {
  @js.native
  sealed trait ArrayBuffer extends js.Object
  
  @js.native
  sealed trait BinaryString extends TextType
  
  @js.native
  sealed trait Blob extends js.Object
  
  @js.native
  sealed trait DataURL extends TextType
  
  @js.native
  sealed trait File extends js.Object
  
  @js.native
  sealed trait Text extends TextType
  
  @scala.inline
  def ArrayBuffer: ArrayBuffer = "ArrayBuffer".asInstanceOf[ArrayBuffer]
  @scala.inline
  def BinaryString: BinaryString = "BinaryString".asInstanceOf[BinaryString]
  @scala.inline
  def Blob: Blob = "Blob".asInstanceOf[Blob]
  @scala.inline
  def DataURL: DataURL = "DataURL".asInstanceOf[DataURL]
  @scala.inline
  def File: File = "File".asInstanceOf[File]
  @scala.inline
  def Text: Text = "Text".asInstanceOf[Text]
}

