package typings.awsSdk.codestarMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeStar extends Service {
  
  /**
    * Adds an IAM user to the team for an AWS CodeStar project.
    */
  def associateTeamMember(): Request[AssociateTeamMemberResult, AWSError] = js.native
  def associateTeamMember(callback: js.Function2[/* err */ AWSError, /* data */ AssociateTeamMemberResult, Unit]): Request[AssociateTeamMemberResult, AWSError] = js.native
  /**
    * Adds an IAM user to the team for an AWS CodeStar project.
    */
  def associateTeamMember(params: AssociateTeamMemberRequest): Request[AssociateTeamMemberResult, AWSError] = js.native
  def associateTeamMember(
    params: AssociateTeamMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateTeamMemberResult, Unit]
  ): Request[AssociateTeamMemberResult, AWSError] = js.native
  
  @JSName("config")
  var config_CodeStar: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a project, including project resources. This action creates a project based on a submitted project request. A set of source code files and a toolchain template file can be included with the project request. If these are not provided, an empty project is created.
    */
  def createProject(): Request[CreateProjectResult, AWSError] = js.native
  def createProject(callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]): Request[CreateProjectResult, AWSError] = js.native
  /**
    * Creates a project, including project resources. This action creates a project based on a submitted project request. A set of source code files and a toolchain template file can be included with the project request. If these are not provided, an empty project is created.
    */
  def createProject(params: CreateProjectRequest): Request[CreateProjectResult, AWSError] = js.native
  def createProject(
    params: CreateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProjectResult, Unit]
  ): Request[CreateProjectResult, AWSError] = js.native
  
  /**
    * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
    */
  def createUserProfile(): Request[CreateUserProfileResult, AWSError] = js.native
  def createUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResult, Unit]): Request[CreateUserProfileResult, AWSError] = js.native
  /**
    * Creates a profile for a user that includes user preferences, such as the display name and email address assocciated with the user, in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar.
    */
  def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult, AWSError] = js.native
  def createUserProfile(
    params: CreateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResult, Unit]
  ): Request[CreateUserProfileResult, AWSError] = js.native
  
  /**
    * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
    */
  def deleteProject(): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]): Request[DeleteProjectResult, AWSError] = js.native
  /**
    * Deletes a project, including project resources. Does not delete users associated with the project, but does delete the IAM roles that allowed access to the project.
    */
  def deleteProject(params: DeleteProjectRequest): Request[DeleteProjectResult, AWSError] = js.native
  def deleteProject(
    params: DeleteProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProjectResult, Unit]
  ): Request[DeleteProjectResult, AWSError] = js.native
  
  /**
    * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
    */
  def deleteUserProfile(): Request[DeleteUserProfileResult, AWSError] = js.native
  def deleteUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserProfileResult, Unit]): Request[DeleteUserProfileResult, AWSError] = js.native
  /**
    * Deletes a user profile in AWS CodeStar, including all personal preference data associated with that profile, such as display name and email address. It does not delete the history of that user, for example the history of commits made by that user.
    */
  def deleteUserProfile(params: DeleteUserProfileRequest): Request[DeleteUserProfileResult, AWSError] = js.native
  def deleteUserProfile(
    params: DeleteUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserProfileResult, Unit]
  ): Request[DeleteUserProfileResult, AWSError] = js.native
  
  /**
    * Describes a project and its resources.
    */
  def describeProject(): Request[DescribeProjectResult, AWSError] = js.native
  def describeProject(callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResult, Unit]): Request[DescribeProjectResult, AWSError] = js.native
  /**
    * Describes a project and its resources.
    */
  def describeProject(params: DescribeProjectRequest): Request[DescribeProjectResult, AWSError] = js.native
  def describeProject(
    params: DescribeProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeProjectResult, Unit]
  ): Request[DescribeProjectResult, AWSError] = js.native
  
  /**
    * Describes a user in AWS CodeStar and the user attributes across all projects.
    */
  def describeUserProfile(): Request[DescribeUserProfileResult, AWSError] = js.native
  def describeUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfileResult, Unit]): Request[DescribeUserProfileResult, AWSError] = js.native
  /**
    * Describes a user in AWS CodeStar and the user attributes across all projects.
    */
  def describeUserProfile(params: DescribeUserProfileRequest): Request[DescribeUserProfileResult, AWSError] = js.native
  def describeUserProfile(
    params: DescribeUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfileResult, Unit]
  ): Request[DescribeUserProfileResult, AWSError] = js.native
  
  /**
    * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
    */
  def disassociateTeamMember(): Request[DisassociateTeamMemberResult, AWSError] = js.native
  def disassociateTeamMember(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTeamMemberResult, Unit]): Request[DisassociateTeamMemberResult, AWSError] = js.native
  /**
    * Removes a user from a project. Removing a user from a project also removes the IAM policies from that user that allowed access to the project and its resources. Disassociating a team member does not remove that user's profile from AWS CodeStar. It does not remove the user from IAM.
    */
  def disassociateTeamMember(params: DisassociateTeamMemberRequest): Request[DisassociateTeamMemberResult, AWSError] = js.native
  def disassociateTeamMember(
    params: DisassociateTeamMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateTeamMemberResult, Unit]
  ): Request[DisassociateTeamMemberResult, AWSError] = js.native
  
  /**
    * Lists all projects in AWS CodeStar associated with your AWS account.
    */
  def listProjects(): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]): Request[ListProjectsResult, AWSError] = js.native
  /**
    * Lists all projects in AWS CodeStar associated with your AWS account.
    */
  def listProjects(params: ListProjectsRequest): Request[ListProjectsResult, AWSError] = js.native
  def listProjects(
    params: ListProjectsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProjectsResult, Unit]
  ): Request[ListProjectsResult, AWSError] = js.native
  
  /**
    * Lists resources associated with a project in AWS CodeStar.
    */
  def listResources(): Request[ListResourcesResult, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResult, Unit]): Request[ListResourcesResult, AWSError] = js.native
  /**
    * Lists resources associated with a project in AWS CodeStar.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResult, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResult, Unit]
  ): Request[ListResourcesResult, AWSError] = js.native
  
  /**
    * Gets the tags for a project.
    */
  def listTagsForProject(): Request[ListTagsForProjectResult, AWSError] = js.native
  def listTagsForProject(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForProjectResult, Unit]): Request[ListTagsForProjectResult, AWSError] = js.native
  /**
    * Gets the tags for a project.
    */
  def listTagsForProject(params: ListTagsForProjectRequest): Request[ListTagsForProjectResult, AWSError] = js.native
  def listTagsForProject(
    params: ListTagsForProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForProjectResult, Unit]
  ): Request[ListTagsForProjectResult, AWSError] = js.native
  
  /**
    * Lists all team members associated with a project.
    */
  def listTeamMembers(): Request[ListTeamMembersResult, AWSError] = js.native
  def listTeamMembers(callback: js.Function2[/* err */ AWSError, /* data */ ListTeamMembersResult, Unit]): Request[ListTeamMembersResult, AWSError] = js.native
  /**
    * Lists all team members associated with a project.
    */
  def listTeamMembers(params: ListTeamMembersRequest): Request[ListTeamMembersResult, AWSError] = js.native
  def listTeamMembers(
    params: ListTeamMembersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTeamMembersResult, Unit]
  ): Request[ListTeamMembersResult, AWSError] = js.native
  
  /**
    * Lists all the user profiles configured for your AWS account in AWS CodeStar.
    */
  def listUserProfiles(): Request[ListUserProfilesResult, AWSError] = js.native
  def listUserProfiles(callback: js.Function2[/* err */ AWSError, /* data */ ListUserProfilesResult, Unit]): Request[ListUserProfilesResult, AWSError] = js.native
  /**
    * Lists all the user profiles configured for your AWS account in AWS CodeStar.
    */
  def listUserProfiles(params: ListUserProfilesRequest): Request[ListUserProfilesResult, AWSError] = js.native
  def listUserProfiles(
    params: ListUserProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUserProfilesResult, Unit]
  ): Request[ListUserProfilesResult, AWSError] = js.native
  
  /**
    * Adds tags to a project.
    */
  def tagProject(): Request[TagProjectResult, AWSError] = js.native
  def tagProject(callback: js.Function2[/* err */ AWSError, /* data */ TagProjectResult, Unit]): Request[TagProjectResult, AWSError] = js.native
  /**
    * Adds tags to a project.
    */
  def tagProject(params: TagProjectRequest): Request[TagProjectResult, AWSError] = js.native
  def tagProject(
    params: TagProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagProjectResult, Unit]
  ): Request[TagProjectResult, AWSError] = js.native
  
  /**
    * Removes tags from a project.
    */
  def untagProject(): Request[UntagProjectResult, AWSError] = js.native
  def untagProject(callback: js.Function2[/* err */ AWSError, /* data */ UntagProjectResult, Unit]): Request[UntagProjectResult, AWSError] = js.native
  /**
    * Removes tags from a project.
    */
  def untagProject(params: UntagProjectRequest): Request[UntagProjectResult, AWSError] = js.native
  def untagProject(
    params: UntagProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagProjectResult, Unit]
  ): Request[UntagProjectResult, AWSError] = js.native
  
  /**
    * Updates a project in AWS CodeStar.
    */
  def updateProject(): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]): Request[UpdateProjectResult, AWSError] = js.native
  /**
    * Updates a project in AWS CodeStar.
    */
  def updateProject(params: UpdateProjectRequest): Request[UpdateProjectResult, AWSError] = js.native
  def updateProject(
    params: UpdateProjectRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProjectResult, Unit]
  ): Request[UpdateProjectResult, AWSError] = js.native
  
  /**
    * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
    */
  def updateTeamMember(): Request[UpdateTeamMemberResult, AWSError] = js.native
  def updateTeamMember(callback: js.Function2[/* err */ AWSError, /* data */ UpdateTeamMemberResult, Unit]): Request[UpdateTeamMemberResult, AWSError] = js.native
  /**
    * Updates a team member's attributes in an AWS CodeStar project. For example, you can change a team member's role in the project, or change whether they have remote access to project resources.
    */
  def updateTeamMember(params: UpdateTeamMemberRequest): Request[UpdateTeamMemberResult, AWSError] = js.native
  def updateTeamMember(
    params: UpdateTeamMemberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateTeamMemberResult, Unit]
  ): Request[UpdateTeamMemberResult, AWSError] = js.native
  
  /**
    * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
    */
  def updateUserProfile(): Request[UpdateUserProfileResult, AWSError] = js.native
  def updateUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserProfileResult, Unit]): Request[UpdateUserProfileResult, AWSError] = js.native
  /**
    * Updates a user's profile in AWS CodeStar. The user profile is not project-specific. Information in the user profile is displayed wherever the user's information appears to other users in AWS CodeStar. 
    */
  def updateUserProfile(params: UpdateUserProfileRequest): Request[UpdateUserProfileResult, AWSError] = js.native
  def updateUserProfile(
    params: UpdateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserProfileResult, Unit]
  ): Request[UpdateUserProfileResult, AWSError] = js.native
}
