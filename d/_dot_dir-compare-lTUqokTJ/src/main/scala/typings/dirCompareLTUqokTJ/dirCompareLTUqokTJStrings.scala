package typings.dirCompareLTUqokTJ

import typings.dirCompareLTUqokTJ.mod.DifferenceState
import typings.dirCompareLTUqokTJ.mod.DifferenceType
import typings.dirCompareLTUqokTJ.mod.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dirCompareLTUqokTJStrings {
  
  @js.native
  sealed trait `broken-link`
    extends StObject
       with DifferenceType
       with Reason
  inline def `broken-link`: `broken-link` = "broken-link".asInstanceOf[`broken-link`]
  
  @js.native
  sealed trait `different-content`
    extends StObject
       with Reason
  inline def `different-content`: `different-content` = "different-content".asInstanceOf[`different-content`]
  
  @js.native
  sealed trait `different-date`
    extends StObject
       with Reason
  inline def `different-date`: `different-date` = "different-date".asInstanceOf[`different-date`]
  
  @js.native
  sealed trait `different-size`
    extends StObject
       with Reason
  inline def `different-size`: `different-size` = "different-size".asInstanceOf[`different-size`]
  
  @js.native
  sealed trait `different-symlink`
    extends StObject
       with Reason
  inline def `different-symlink`: `different-symlink` = "different-symlink".asInstanceOf[`different-symlink`]
  
  @js.native
  sealed trait directory
    extends StObject
       with DifferenceType
  inline def directory: directory = "directory".asInstanceOf[directory]
  
  @js.native
  sealed trait distinct
    extends StObject
       with DifferenceState
  inline def distinct: distinct = "distinct".asInstanceOf[distinct]
  
  @js.native
  sealed trait equal
    extends StObject
       with DifferenceState
  inline def equal: equal = "equal".asInstanceOf[equal]
  
  @js.native
  sealed trait file
    extends StObject
       with DifferenceType
  inline def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait left
    extends StObject
       with DifferenceState
  inline def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait missing
    extends StObject
       with DifferenceType
  inline def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait right
    extends StObject
       with DifferenceState
  inline def right: right = "right".asInstanceOf[right]
}
