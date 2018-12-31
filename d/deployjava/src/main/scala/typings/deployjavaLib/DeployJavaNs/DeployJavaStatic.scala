package typings
package deployjavaLib.DeployJavaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for {@link deployJava} object.
  * @author  Cyril Schumacher
  * @version 1.0
  */
@js.native
trait DeployJavaStatic extends js.Object {
  /**
    * @summary Early Access state.
    * @member  {string}
    */
  var EAInstallEnabled: scala.Boolean = js.native
  /**
    * @summary URL to early access.
    * @member  {string}
    */
  var EarlyAccessURL: java.lang.String = js.native
  /**
    * @summary Brand name.
    * @member  {string}
    */
  var brand: java.lang.String = js.native
  /**
    * @summary Debug mode.
    * @member  {boolean}
    */
  var debug: scala.Boolean = js.native
  /**
    * @summary Preferred install type (null, online, kernel).
    * @member  {string}
    */
  var installType: java.lang.String = js.native
  /**
    * @summary Locale.
    * @member  {string}
    */
  var locale: java.lang.String = js.native
  /**
    * @summary Interval for check versions of JRE available.
    * @member  {number}
    */
  var myInterval: scala.Double = js.native
  /**
    * @summary JRE versions installed.
    * @member  {Array<string>}
    */
  var preInstallJREList: js.Array[java.lang.String] = js.native
  /**
    * @summary URL of current document.
    * @member  {string}
    */
  var returnPage: java.lang.String = js.native
  /**
    * @summary Redirect to Java plugin website for Mozilla Firefox.
    * @return  {boolean} True if the redirection to Java plugin website was performed, otherwise, False.
    */
  def FFInstall(): scala.Boolean = js.native
  /**
    * Redirect to Java plugin website for Internet Explorer.
    * @return {boolean} True if the redirection to Java plugin website was performed, otherwise, False.
    */
  def IEInstall(): scala.Boolean = js.native
  /**
    * @summary Determines if the browser has allowed the Java plugin.
    * @return  {boolean} True if the Java plugin is allowed, otherwise, False.
    */
  def allowPlugin(): scala.Boolean = js.native
  /**
    * @summary Compares a version with a pattern.
    * @param   {string}        version        Version to compare.
    * @param   {Array<string>} patternArray   Patterns to compare.
    * @param   {boolean}       familyMatch    Family match.
    * @param   {boolean}       minMatch       Minimum version match.
    * @return  {boolean}       True if a or many patterns are identical to version, otherwise, False.
    */
  def compareVersionToPattern(
    version: java.lang.String,
    patternArray: js.Array[java.lang.String],
    familyMatch: scala.Boolean,
    minMatch: scala.Boolean
  ): scala.Boolean = js.native
  /**
    * @summary Compares a installed version and required version.
    * @param   {string}  installed JRE installed version.
    * @param   {string}  required  JRE required version.
    * @return  {boolean} True if installed version is greater than or equal to required version.
    */
  def compareVersions(installed: java.lang.String, required: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Enable alerts.
    */
  def enableAlerts(): scala.Unit = js.native
  /**
    * @summary Gets browser name.
    * @return {string} Browser name.
    */
  def getBrowser(): java.lang.String = js.native
  /**
    * @summary Obtains JPI version using {@link navigator.mimeTypes} array if found,
    * set the version to {@link firefoxJavaVersion}.
    */
  def getJPIVersionUsingMimeType(): scala.Unit = js.native
  /**
    * @summary Get JRE versions (in format : "#.#[.#[_#]]") installed.
    * @return {Array<string>} JRE Version list.
    */
  def getJREs(): js.Array[java.lang.String] = js.native
  /**
    * Gets a Java plugin.
    * @return {HTMLElement} Java plugin.
    */
  def getPlugin(): stdLib.HTMLElement = js.native
  /**
    * @summary Triggers a JRE installation.
    * @param   {string} requestVersion JRE request version.
    * @return  {boolean}      True if the install is succeeded, otherwise, False.
    */
  def installJRE(requestVersion: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Triggers a installation of the latest version of JRE.
    * @param   {Function} installCallback A reference to a javascript callback function for reporting install status.
    * @return  {boolean}  True if the install is succeeded, otherwise, False.
    */
  def installLatestJRE(): scala.Boolean = js.native
  def installLatestJRE(installCallback: js.Function): scala.Boolean = js.native
  /**
    * @summary Determines if JRE auto install for the version is enabled for the local system.
    *
    * DT plugin for 6uX only knows about JRE installer signed by SUN cert.
    * If it encounter Oracle signed JRE installer, it will have chance of
    * deadlock when running with IE. This function is to guard against this.
    *
    * @param   {string} requestedJREVersion JRE version. If not specified, it will be treated as installing any JRE version.
    * @return  {boolean} True if JRE auto install for the version is enabled for the local system, otherwise, False.
    */
  def isAutoInstallEnabled(): scala.Boolean = js.native
  def isAutoInstallEnabled(requestedJREVersion: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Determines if the plugin is installed and AutoUpdate is enabled.
    * @return  {boolean} True if the plugin is installed and AutoUpdate is enabled, otherwise, False.
    */
  def isAutoUpdateEnabled(): scala.Boolean = js.native
  /**
    * @summary Determines if JRE install callback is supported.
    * @return {boolean} True if JRE install callback is supported, otherwise, False.
    */
  def isCallbackSupported(): scala.Boolean = js.native
  /**
    * @summary Determines if the next generation plugin (Plugin II) is default.
    * @return  {boolean} True if next generation plugin is default, otherwise, False.
    */
  def isPlugin2(): scala.Boolean = js.native
  /**
    * @summary Determines if the ActiveX or XPI plugin is installed.
    * @return  {boolean} True if the ActiveX or XPI plugin is installed, otherwise, False.
    */
  def isPluginInstalled(): scala.Boolean = js.native
  /**
    * @summary Checks if an installation of Java Web Start of the specified minimum version can be detected.
    * @param   {string}  minimumVersion Minimum version.
    * @return  {boolean} True if an installation of Java Web Start of the specified minimum version can be detected
    */
  def isWebStartInstalled(): scala.Boolean = js.native
  def isWebStartInstalled(minimumVersion: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Launch a JNLP application (using the plugin if available).
    * @param  {string} jnlp JNLP file.
    * @return {boolean} True if a JNLP application is launched, otherwise, False.
    */
  def launch(jnlp: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Launch the specified JNLP application using the passed in jnlp file.
    * @param   {string} jnlp JNLP file.
    */
  def launchWebStartApplication(jnlp: java.lang.String): scala.Unit = js.native
  /**
    * @summary Checks versions of JRE available.
    */
  def poll(): scala.Unit = js.native
  /**
    * @summary Writes embed tags if JRE plugin is available.
    */
  def refresh(): scala.Unit = js.native
  /**
    * @summary Ensures that an appropriate JRE is installed and then runs an applet.
    *
    * After installJRE() is called, the script will attempt to detect that the
    * JRE installation has completed and begin running the applet, but there
    * are circumstances (such as when the JRE installation requires a browser
    * restart) when this cannot be fulfilled.
    * As with writeAppletTag(), this function should only be called prior to
    * the web page being completely rendered.  Note that version wildcards
    * (star (*) and plus (+)) are not supported, and including them in the
    * minimumVersion will result in an error message.
    *
    * @param {Object} attributes     Names and values of the attributes of the generated <applet> tag.
    * @param {Object} parameters     Names and values of the <param> tags in the generated <applet> tag.
    * @param {string} minimumVersion A minimum version of the JRE software that is required to run this applet. Default value is : "1.1".
    */
  def runApplet(attributes: js.Object, parameters: js.Object): scala.Unit = js.native
  def runApplet(attributes: js.Object, parameters: js.Object, minimumVersion: java.lang.String): scala.Unit = js.native
  /**
    * @summary Sets additional package list.
    *
    * Note: To be used by kernel installer.
    *
    * @param  {string}  packageList Package list.
    * @return {boolean} True if the value was set, otherwise, False if the plugin is already installed.
    */
  def setAdditionalPackages(packageList: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Sets AutoUpdate on if plugin is installed.
    */
  def setAutoUpdateEnabled(): scala.Unit = js.native
  /**
    * @summary Sets preference to install Early Access versions if available.
    * @param   {string} enabled Preference to install Early Access versions.
    */
  def setEarlyAccess(enabled: java.lang.String): scala.Unit = js.native
  /**
    * @summary Sets the preferred install type.
    * @param   {string}  type Preferred install (null, online or kernel).
    * @return  {boolean} True if the value was set, otherwise, False if the plugin is already installed.
    */
  def setInstallerType(`type`: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Detects the Microsoft virtual machine.
    * @return  {boolean} True if the Microsoft virtual machine exists, otherwise, False.
    */
  def testForMSVM(): scala.Boolean = js.native
  /**
    * @summary Checks if ActiveX can be used with Java plugin.
    * @param   {string}  Java version.
    * @return  {boolean} True if ActiveX can be used, otherwise, False.
    */
  def testUsingActiveX(version: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Checks if MIME types can be used with Java plugin.
    * @param   {string}  Java version.
    * @return  {boolean} True if MIME types can be used, otherwise, False.
    */
  def testUsingMimeTypes(version: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Checks if plugins can be used with Java plugin.
    * @param   {string}  Java version.
    * @return  {boolean} True if plugins can be used, otherwise, False.
    */
  def testUsingPluginsArray(version: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Check if there is a matching JRE version currently installed.
    * @param   {string} versionPattern Java version pattern (in format : #[.#[.#[_#]]][+|*]).
    * @return  {boolean} True if there is a matching JRE version currently installed, otherwise, False.
    */
  def versionCheck(versionPattern: java.lang.String): scala.Boolean = js.native
  /**
    * @summary Write in outputs an applet tag for applet with the specified attributes and parameters.
    *
    * Each key/value pair in attributes becomes an attribute of the applet tag
    * itself, while key/value pairs in parameters become <PARAM> tags.
    * No version checking or other special behaviors are performed; the tag is
    * simply written to the page using document.writeln().
    * As document.writeln() is generally only safe to use while the page is
    * being rendered, you should never call this function after the page
    * has been completed.
    *
    * @param {Object} attributes     Names and values of the attributes of the generated <applet> tag.
    * @param {Object} parameters     Names and values of the <param> tags in the generated <applet> tag.
    */
  def writeAppletTag(attributes: js.Object, parameters: js.Object): scala.Unit = js.native
  /**
    * @summary Write in outputs an embed tag for applet.
    */
  def writeEmbedTag(): scala.Unit = js.native
}

