package typings.degit

import typings.degit.mod.DegitErrorCode
import typings.degit.mod.InfoCode
import typings.degit.mod.ValidModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object degitStrings {
  @js.native
  sealed trait BAD_REF extends DegitErrorCode
  
  @js.native
  sealed trait BAD_SRC extends DegitErrorCode
  
  @js.native
  sealed trait COULD_NOT_DOWNLOAD extends DegitErrorCode
  
  @js.native
  sealed trait COULD_NOT_FETCH extends DegitErrorCode
  
  @js.native
  sealed trait DEST_IS_EMPTY extends InfoCode
  
  @js.native
  sealed trait DEST_NOT_EMPTY
    extends DegitErrorCode
       with InfoCode
  
  @js.native
  sealed trait DOWNLOADING extends InfoCode
  
  @js.native
  sealed trait EXTRACTING extends InfoCode
  
  @js.native
  sealed trait FILE_DOES_NOT_EXIST extends InfoCode
  
  @js.native
  sealed trait FILE_EXISTS extends InfoCode
  
  @js.native
  sealed trait FOUND_MATCH extends InfoCode
  
  @js.native
  sealed trait MISSING_REF extends DegitErrorCode
  
  @js.native
  sealed trait PROXY extends InfoCode
  
  @js.native
  sealed trait REMOVED extends InfoCode
  
  @js.native
  sealed trait SUCCESS extends InfoCode
  
  @js.native
  sealed trait UNSUPPORTED_HOST extends DegitErrorCode
  
  @js.native
  sealed trait USING_CACHE extends InfoCode
  
  @js.native
  sealed trait clone extends js.Object
  
  @js.native
  sealed trait git extends ValidModes
  
  @js.native
  sealed trait info extends js.Object
  
  @js.native
  sealed trait remove extends js.Object
  
  @js.native
  sealed trait tar extends ValidModes
  
  @js.native
  sealed trait warn extends js.Object
  
  @scala.inline
  def BAD_REF: BAD_REF = "BAD_REF".asInstanceOf[BAD_REF]
  @scala.inline
  def BAD_SRC: BAD_SRC = "BAD_SRC".asInstanceOf[BAD_SRC]
  @scala.inline
  def COULD_NOT_DOWNLOAD: COULD_NOT_DOWNLOAD = "COULD_NOT_DOWNLOAD".asInstanceOf[COULD_NOT_DOWNLOAD]
  @scala.inline
  def COULD_NOT_FETCH: COULD_NOT_FETCH = "COULD_NOT_FETCH".asInstanceOf[COULD_NOT_FETCH]
  @scala.inline
  def DEST_IS_EMPTY: DEST_IS_EMPTY = "DEST_IS_EMPTY".asInstanceOf[DEST_IS_EMPTY]
  @scala.inline
  def DEST_NOT_EMPTY: DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[DEST_NOT_EMPTY]
  @scala.inline
  def DOWNLOADING: DOWNLOADING = "DOWNLOADING".asInstanceOf[DOWNLOADING]
  @scala.inline
  def EXTRACTING: EXTRACTING = "EXTRACTING".asInstanceOf[EXTRACTING]
  @scala.inline
  def FILE_DOES_NOT_EXIST: FILE_DOES_NOT_EXIST = "FILE_DOES_NOT_EXIST".asInstanceOf[FILE_DOES_NOT_EXIST]
  @scala.inline
  def FILE_EXISTS: FILE_EXISTS = "FILE_EXISTS".asInstanceOf[FILE_EXISTS]
  @scala.inline
  def FOUND_MATCH: FOUND_MATCH = "FOUND_MATCH".asInstanceOf[FOUND_MATCH]
  @scala.inline
  def MISSING_REF: MISSING_REF = "MISSING_REF".asInstanceOf[MISSING_REF]
  @scala.inline
  def PROXY: PROXY = "PROXY".asInstanceOf[PROXY]
  @scala.inline
  def REMOVED: REMOVED = "REMOVED".asInstanceOf[REMOVED]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def UNSUPPORTED_HOST: UNSUPPORTED_HOST = "UNSUPPORTED_HOST".asInstanceOf[UNSUPPORTED_HOST]
  @scala.inline
  def USING_CACHE: USING_CACHE = "USING_CACHE".asInstanceOf[USING_CACHE]
  @scala.inline
  def git: git = "git".asInstanceOf[git]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def remove: remove = "remove".asInstanceOf[remove]
  @scala.inline
  def tar: tar = "tar".asInstanceOf[tar]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}

