package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.mod.ArrayRelation
import typings.ckeditorCkeditor5Utils.mod.Change
import typings.ckeditorCkeditor5Utils.mod.PriorityString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ckeditorCkeditor5UtilsStrings {
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def equal: equal = "equal".asInstanceOf[equal]
  
  @scala.inline
  def extension: extension = "extension".asInstanceOf[extension]
  
  @scala.inline
  def high: high = "high".asInstanceOf[high]
  
  @scala.inline
  def highest: highest = "highest".asInstanceOf[highest]
  
  @scala.inline
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def low: low = "low".asInstanceOf[low]
  
  @scala.inline
  def lowest: lowest = "lowest".asInstanceOf[lowest]
  
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @scala.inline
  def prefix: prefix = "prefix".asInstanceOf[prefix]
  
  @scala.inline
  def same: same = "same".asInstanceOf[same]
  
  @js.native
  sealed trait delete extends Change
  
  @js.native
  sealed trait equal extends Change
  
  @js.native
  sealed trait extension extends ArrayRelation
  
  @js.native
  sealed trait high extends PriorityString
  
  @js.native
  sealed trait highest extends PriorityString
  
  @js.native
  sealed trait insert extends Change
  
  @js.native
  sealed trait low extends PriorityString
  
  @js.native
  sealed trait lowest extends PriorityString
  
  @js.native
  sealed trait normal extends PriorityString
  
  @js.native
  sealed trait prefix extends ArrayRelation
  
  @js.native
  sealed trait same extends ArrayRelation
}
