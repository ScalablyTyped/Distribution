package typings.degit

import typings.degit.mod.DegitErrorCode
import typings.degit.mod.InfoCode
import typings.degit.mod.ValidModes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object degitStrings {
  
  @js.native
  sealed trait BAD_REF extends DegitErrorCode
  @scala.inline
  def BAD_REF: BAD_REF = "BAD_REF".asInstanceOf[BAD_REF]
  
  @js.native
  sealed trait BAD_SRC extends DegitErrorCode
  @scala.inline
  def BAD_SRC: BAD_SRC = "BAD_SRC".asInstanceOf[BAD_SRC]
  
  @js.native
  sealed trait COULD_NOT_DOWNLOAD extends DegitErrorCode
  @scala.inline
  def COULD_NOT_DOWNLOAD: COULD_NOT_DOWNLOAD = "COULD_NOT_DOWNLOAD".asInstanceOf[COULD_NOT_DOWNLOAD]
  
  @js.native
  sealed trait COULD_NOT_FETCH extends DegitErrorCode
  @scala.inline
  def COULD_NOT_FETCH: COULD_NOT_FETCH = "COULD_NOT_FETCH".asInstanceOf[COULD_NOT_FETCH]
  
  @js.native
  sealed trait DEST_IS_EMPTY extends InfoCode
  @scala.inline
  def DEST_IS_EMPTY: DEST_IS_EMPTY = "DEST_IS_EMPTY".asInstanceOf[DEST_IS_EMPTY]
  
  @js.native
  sealed trait DEST_NOT_EMPTY
    extends DegitErrorCode
       with InfoCode
  @scala.inline
  def DEST_NOT_EMPTY: DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[DEST_NOT_EMPTY]
  
  @js.native
  sealed trait DOWNLOADING extends InfoCode
  @scala.inline
  def DOWNLOADING: DOWNLOADING = "DOWNLOADING".asInstanceOf[DOWNLOADING]
  
  @js.native
  sealed trait EXTRACTING extends InfoCode
  @scala.inline
  def EXTRACTING: EXTRACTING = "EXTRACTING".asInstanceOf[EXTRACTING]
  
  @js.native
  sealed trait FILE_DOES_NOT_EXIST extends InfoCode
  @scala.inline
  def FILE_DOES_NOT_EXIST: FILE_DOES_NOT_EXIST = "FILE_DOES_NOT_EXIST".asInstanceOf[FILE_DOES_NOT_EXIST]
  
  @js.native
  sealed trait FILE_EXISTS extends InfoCode
  @scala.inline
  def FILE_EXISTS: FILE_EXISTS = "FILE_EXISTS".asInstanceOf[FILE_EXISTS]
  
  @js.native
  sealed trait FOUND_MATCH extends InfoCode
  @scala.inline
  def FOUND_MATCH: FOUND_MATCH = "FOUND_MATCH".asInstanceOf[FOUND_MATCH]
  
  @js.native
  sealed trait MISSING_REF extends DegitErrorCode
  @scala.inline
  def MISSING_REF: MISSING_REF = "MISSING_REF".asInstanceOf[MISSING_REF]
  
  @js.native
  sealed trait PROXY extends InfoCode
  @scala.inline
  def PROXY: PROXY = "PROXY".asInstanceOf[PROXY]
  
  @js.native
  sealed trait REMOVED extends InfoCode
  @scala.inline
  def REMOVED: REMOVED = "REMOVED".asInstanceOf[REMOVED]
  
  @js.native
  sealed trait SUCCESS extends InfoCode
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait UNSUPPORTED_HOST extends DegitErrorCode
  @scala.inline
  def UNSUPPORTED_HOST: UNSUPPORTED_HOST = "UNSUPPORTED_HOST".asInstanceOf[UNSUPPORTED_HOST]
  
  @js.native
  sealed trait USING_CACHE extends InfoCode
  @scala.inline
  def USING_CACHE: USING_CACHE = "USING_CACHE".asInstanceOf[USING_CACHE]
  
  @js.native
  sealed trait clone extends StObject
  
  @js.native
  sealed trait git extends ValidModes
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  
  @js.native
  sealed trait info extends StObject
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait remove extends StObject
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  
  @js.native
  sealed trait tar extends ValidModes
  @scala.inline
  def tar: tar = "tar".asInstanceOf[tar]
  
  @js.native
  sealed trait warn extends StObject
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
