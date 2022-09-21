package typings.clamscan

import org.scalablytyped.runtime.StringDictionary
import typings.clamscan.mod.NodeClamError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Active extends StObject {
    
    /** If true, this module will consider using the clamscan binary */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** Path to a custom virus definition database */
    var db: js.UndefOr[String] = js.undefined
    
    /** Path to clamscan binary on your server */
    var path: js.UndefOr[String] = js.undefined
    
    /** If true, scan archives (ex. zip, rar, tar, dmg, iso, etc...) */
    var scanArchives: js.UndefOr[Boolean] = js.undefined
  }
  object Active {
    
    inline def apply(): Active = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Active]
    }
    
    extension [Self <: Active](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setDb(value: String): Self = StObject.set(x, "db", value.asInstanceOf[js.Any])
      
      inline def setDbUndefined: Self = StObject.set(x, "db", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setScanArchives(value: Boolean): Self = StObject.set(x, "scanArchives", value.asInstanceOf[js.Any])
      
      inline def setScanArchivesUndefined: Self = StObject.set(x, "scanArchives", js.undefined)
    }
  }
  
  trait BypassTest extends StObject {
    
    /** If true, this module will consider using the clamdscan binary */
    var active: js.UndefOr[Boolean] = js.undefined
    
    /** Check to see if socket is available when applicable */
    var bypassTest: js.UndefOr[Boolean] = js.undefined
    
    /** Specify config file if it's in an unusual place */
    var configFile: js.UndefOr[String] = js.undefined
    
    /** IP of host to connect to TCP interface */
    var host: js.UndefOr[String | Boolean] = js.undefined
    
    /** Do not fail over to binary-method of scanning */
    var localFallback: js.UndefOr[Boolean] = js.undefined
    
    /** Scan using all available cores! Yay! */
    var multiscan: js.UndefOr[Boolean] = js.undefined
    
    /** Path to the clamdscan binary on your server */
    var path: js.UndefOr[String] = js.undefined
    
    /** Port of host to use when connecting via TCP interface */
    var port: js.UndefOr[Double | Boolean] = js.undefined
    
    /** If true, will re-load the DB on every call (slow) */
    var reloadDb: js.UndefOr[Boolean] = js.undefined
    
    /** Socket file for connecting via TCP */
    var socket: js.UndefOr[String | Boolean] = js.undefined
    
    /** Timeout for scanning files */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object BypassTest {
    
    inline def apply(): BypassTest = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BypassTest]
    }
    
    extension [Self <: BypassTest](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setBypassTest(value: Boolean): Self = StObject.set(x, "bypassTest", value.asInstanceOf[js.Any])
      
      inline def setBypassTestUndefined: Self = StObject.set(x, "bypassTest", js.undefined)
      
      inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
      
      inline def setConfigFileUndefined: Self = StObject.set(x, "configFile", js.undefined)
      
      inline def setHost(value: String | Boolean): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setLocalFallback(value: Boolean): Self = StObject.set(x, "localFallback", value.asInstanceOf[js.Any])
      
      inline def setLocalFallbackUndefined: Self = StObject.set(x, "localFallback", js.undefined)
      
      inline def setMultiscan(value: Boolean): Self = StObject.set(x, "multiscan", value.asInstanceOf[js.Any])
      
      inline def setMultiscanUndefined: Self = StObject.set(x, "multiscan", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPort(value: Double | Boolean): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setReloadDb(value: Boolean): Self = StObject.set(x, "reloadDb", value.asInstanceOf[js.Any])
      
      inline def setReloadDbUndefined: Self = StObject.set(x, "reloadDb", js.undefined)
      
      inline def setSocket(value: String | Boolean): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
      
      inline def setSocketUndefined: Self = StObject.set(x, "socket", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Isinfected extends StObject {
    
    var is_infected: String
    
    var viruses: js.Array[String]
  }
  object Isinfected {
    
    inline def apply(is_infected: String, viruses: js.Array[String]): Isinfected = {
      val __obj = js.Dynamic.literal(is_infected = is_infected.asInstanceOf[js.Any], viruses = viruses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Isinfected]
    }
    
    extension [Self <: Isinfected](x: Self) {
      
      inline def setIs_infected(value: String): Self = StObject.set(x, "is_infected", value.asInstanceOf[js.Any])
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
  
  /* Inlined std.Readonly<clamscan.clamscan.Options> */
  trait ReadonlyOptions extends StObject {
    
    val clamdscan: js.UndefOr[BypassTest] = js.undefined
    
    val clamscan: js.UndefOr[Active] = js.undefined
    
    val debugMode: js.UndefOr[Boolean] = js.undefined
    
    val fileList: js.UndefOr[String] = js.undefined
    
    val preference: js.UndefOr[Any] = js.undefined
    
    val quarantineInfected: js.UndefOr[Boolean | String] = js.undefined
    
    val removeInfected: js.UndefOr[Boolean] = js.undefined
    
    val scanLog: js.UndefOr[String] = js.undefined
    
    val scanRecursively: js.UndefOr[Boolean] = js.undefined
  }
  object ReadonlyOptions {
    
    inline def apply(): ReadonlyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReadonlyOptions]
    }
    
    extension [Self <: ReadonlyOptions](x: Self) {
      
      inline def setClamdscan(value: BypassTest): Self = StObject.set(x, "clamdscan", value.asInstanceOf[js.Any])
      
      inline def setClamdscanUndefined: Self = StObject.set(x, "clamdscan", js.undefined)
      
      inline def setClamscan(value: Active): Self = StObject.set(x, "clamscan", value.asInstanceOf[js.Any])
      
      inline def setClamscanUndefined: Self = StObject.set(x, "clamscan", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setFileList(value: String): Self = StObject.set(x, "fileList", value.asInstanceOf[js.Any])
      
      inline def setFileListUndefined: Self = StObject.set(x, "fileList", js.undefined)
      
      inline def setPreference(value: Any): Self = StObject.set(x, "preference", value.asInstanceOf[js.Any])
      
      inline def setPreferenceUndefined: Self = StObject.set(x, "preference", js.undefined)
      
      inline def setQuarantineInfected(value: Boolean | String): Self = StObject.set(x, "quarantineInfected", value.asInstanceOf[js.Any])
      
      inline def setQuarantineInfectedUndefined: Self = StObject.set(x, "quarantineInfected", js.undefined)
      
      inline def setRemoveInfected(value: Boolean): Self = StObject.set(x, "removeInfected", value.asInstanceOf[js.Any])
      
      inline def setRemoveInfectedUndefined: Self = StObject.set(x, "removeInfected", js.undefined)
      
      inline def setScanLog(value: String): Self = StObject.set(x, "scanLog", value.asInstanceOf[js.Any])
      
      inline def setScanLogUndefined: Self = StObject.set(x, "scanLog", js.undefined)
      
      inline def setScanRecursively(value: Boolean): Self = StObject.set(x, "scanRecursively", value.asInstanceOf[js.Any])
      
      inline def setScanRecursivelyUndefined: Self = StObject.set(x, "scanRecursively", js.undefined)
    }
  }
  
  /* Inlined clamscan.clamscan.Response<{  file :string,   isInfected :boolean | null}> */
  trait ResponsefilestringisInfec extends StObject {
    
    var file: String
    
    var isInfected: Boolean | Null
    
    var viruses: js.Array[String]
  }
  object ResponsefilestringisInfec {
    
    inline def apply(file: String, viruses: js.Array[String]): ResponsefilestringisInfec = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], viruses = viruses.asInstanceOf[js.Any], isInfected = null)
      __obj.asInstanceOf[ResponsefilestringisInfec]
    }
    
    extension [Self <: ResponsefilestringisInfec](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setIsInfected(value: Boolean): Self = StObject.set(x, "isInfected", value.asInstanceOf[js.Any])
      
      inline def setIsInfectedNull: Self = StObject.set(x, "isInfected", null)
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
  
  /* Inlined clamscan.clamscan.Response<{  file :string,   isInfected :boolean}> */
  trait ResponsefilestringisInfecFile extends StObject {
    
    var file: String
    
    var isInfected: Boolean
    
    var viruses: js.Array[String]
  }
  object ResponsefilestringisInfecFile {
    
    inline def apply(file: String, isInfected: Boolean, viruses: js.Array[String]): ResponsefilestringisInfecFile = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], isInfected = isInfected.asInstanceOf[js.Any], viruses = viruses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsefilestringisInfecFile]
    }
    
    extension [Self <: ResponsefilestringisInfecFile](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setIsInfected(value: Boolean): Self = StObject.set(x, "isInfected", value.asInstanceOf[js.Any])
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
  
  /* Inlined clamscan.clamscan.Response<{  goodFiles :std.Array<string>,   badFiles :std.Array<string>,   errors :{[filename: string] : clamscan.clamscan.NodeClamError}}> */
  trait ResponsegoodFilesArraystr extends StObject {
    
    var badFiles: js.Array[String]
    
    var errors: StringDictionary[NodeClamError]
    
    var goodFiles: js.Array[String]
    
    var viruses: js.Array[String]
  }
  object ResponsegoodFilesArraystr {
    
    inline def apply(
      badFiles: js.Array[String],
      errors: StringDictionary[NodeClamError],
      goodFiles: js.Array[String],
      viruses: js.Array[String]
    ): ResponsegoodFilesArraystr = {
      val __obj = js.Dynamic.literal(badFiles = badFiles.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], goodFiles = goodFiles.asInstanceOf[js.Any], viruses = viruses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsegoodFilesArraystr]
    }
    
    extension [Self <: ResponsegoodFilesArraystr](x: Self) {
      
      inline def setBadFiles(value: js.Array[String]): Self = StObject.set(x, "badFiles", value.asInstanceOf[js.Any])
      
      inline def setBadFilesVarargs(value: String*): Self = StObject.set(x, "badFiles", js.Array(value*))
      
      inline def setErrors(value: StringDictionary[NodeClamError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setGoodFiles(value: js.Array[String]): Self = StObject.set(x, "goodFiles", value.asInstanceOf[js.Any])
      
      inline def setGoodFilesVarargs(value: String*): Self = StObject.set(x, "goodFiles", js.Array(value*))
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
  
  /* Inlined clamscan.clamscan.Response<{  path :string,   isInfected :boolean,   goodFiles :std.Array<string>,   badFiles :std.Array<string>}> */
  trait ResponsepathstringisInfec extends StObject {
    
    var badFiles: js.Array[String]
    
    var goodFiles: js.Array[String]
    
    var isInfected: Boolean
    
    var path: String
    
    var viruses: js.Array[String]
  }
  object ResponsepathstringisInfec {
    
    inline def apply(
      badFiles: js.Array[String],
      goodFiles: js.Array[String],
      isInfected: Boolean,
      path: String,
      viruses: js.Array[String]
    ): ResponsepathstringisInfec = {
      val __obj = js.Dynamic.literal(badFiles = badFiles.asInstanceOf[js.Any], goodFiles = goodFiles.asInstanceOf[js.Any], isInfected = isInfected.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], viruses = viruses.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsepathstringisInfec]
    }
    
    extension [Self <: ResponsepathstringisInfec](x: Self) {
      
      inline def setBadFiles(value: js.Array[String]): Self = StObject.set(x, "badFiles", value.asInstanceOf[js.Any])
      
      inline def setBadFilesVarargs(value: String*): Self = StObject.set(x, "badFiles", js.Array(value*))
      
      inline def setGoodFiles(value: js.Array[String]): Self = StObject.set(x, "goodFiles", value.asInstanceOf[js.Any])
      
      inline def setGoodFilesVarargs(value: String*): Self = StObject.set(x, "goodFiles", js.Array(value*))
      
      inline def setIsInfected(value: Boolean): Self = StObject.set(x, "isInfected", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
  
  trait Viruses extends StObject {
    
    var viruses: js.Array[String]
  }
  object Viruses {
    
    inline def apply(viruses: js.Array[String]): Viruses = {
      val __obj = js.Dynamic.literal(viruses = viruses.asInstanceOf[js.Any])
      __obj.asInstanceOf[Viruses]
    }
    
    extension [Self <: Viruses](x: Self) {
      
      inline def setViruses(value: js.Array[String]): Self = StObject.set(x, "viruses", value.asInstanceOf[js.Any])
      
      inline def setVirusesVarargs(value: String*): Self = StObject.set(x, "viruses", js.Array(value*))
    }
  }
}
