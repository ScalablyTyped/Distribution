package typings.binaryParser

import typings.binaryParser.mod.Parser.Endianness
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binaryParserStrings {
  
  @js.native
  sealed trait Next extends StObject
  @scala.inline
  def Next: Next = "Next".asInstanceOf[Next]
  
  @js.native
  sealed trait big extends Endianness
  @scala.inline
  def big: big = "big".asInstanceOf[big]
  
  @js.native
  sealed trait little extends Endianness
  @scala.inline
  def little: little = "little".asInstanceOf[little]
}
