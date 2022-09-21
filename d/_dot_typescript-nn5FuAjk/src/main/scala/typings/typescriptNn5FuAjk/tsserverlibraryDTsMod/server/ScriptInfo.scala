package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.Array
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.FormatCodeSettings
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.IScriptSnapshot
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.Path
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.ScriptKind
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.TextSpan
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.Location
import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.UserPreferences
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport(".typescript-nn5FuAjk/lib/tsserverlibrary.d.ts", "server.ScriptInfo")
@js.native
open class ScriptInfo protected () extends StObject {
  def this(
    host: ServerHost,
    fileName: NormalizedPath,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    path: Path
  ) = this()
  def this(
    host: ServerHost,
    fileName: NormalizedPath,
    scriptKind: ScriptKind,
    hasMixedContent: Boolean,
    path: Path,
    initialVersion: ScriptInfoVersion
  ) = this()
  
  def attachToProject(project: Project): Boolean = js.native
  
  def close(): Unit = js.native
  def close(fileExists: Boolean): Unit = js.native
  
  /**
    * All projects that include this file
    */
  val containingProjects: Array[Project] = js.native
  
  def detachAllProjects(): Unit = js.native
  
  def detachFromProject(project: Project): Unit = js.native
  
  def editContent(start: Double, end: Double, newText: String): Unit = js.native
  
  /* private */ var ensureRealPath: Any = js.native
  
  val fileName: NormalizedPath = js.native
  
  /* private */ var formatSettings: Any = js.native
  
  def getDefaultProject(): Project = js.native
  
  def getFormatCodeSettings(): js.UndefOr[FormatCodeSettings] = js.native
  
  def getLatestVersion(): String = js.native
  
  def getPreferences(): js.UndefOr[UserPreferences] = js.native
  
  def getSnapshot(): IScriptSnapshot = js.native
  
  val hasMixedContent: Boolean = js.native
  
  /* private */ val host: Any = js.native
  
  def isAttached(project: Project): Boolean = js.native
  
  def isJavaScript(): Boolean = js.native
  
  def isOrphan(): Boolean = js.native
  
  def isScriptOpen(): Boolean = js.native
  
  /**
    * @param line 1 based index
    * @param offset 1 based index
    */
  def lineOffsetToPosition(line: Double, offset: Double): Double = js.native
  
  /**
    *  @param line 1 based index
    */
  def lineToTextSpan(line: Double): TextSpan = js.native
  
  def markContainingProjectsAsDirty(): Unit = js.native
  
  def open(newText: String): Unit = js.native
  
  val path: Path = js.native
  
  def positionToLineOffset(position: Double): Location = js.native
  
  /* private */ var preferences: Any = js.native
  
  def registerFileUpdate(): Unit = js.native
  
  def reloadFromFile(): Boolean = js.native
  def reloadFromFile(tempFileName: NormalizedPath): Boolean = js.native
  
  def saveTo(fileName: String): Unit = js.native
  
  val scriptKind: ScriptKind = js.native
  
  def setOptions(formatSettings: FormatCodeSettings): Unit = js.native
  def setOptions(formatSettings: FormatCodeSettings, preferences: UserPreferences): Unit = js.native
  
  /* private */ var textStorage: Any = js.native
}
